import con from "../model/connection.js";
import { queries } from "../model/queries.js";
import { insertValues } from "../model/queryValues.js";

// export const userRegistration = (request,response)=>{
//     console.log(request.body);
//     const {username,email,password,address} = request.body;
    
//     const insertQuery = "insert into users(username,email,password,address) values (?,?,?,?)";
//     const insertValues = [username,email,password,address];

//     con.query(insertQuery,insertValues,(error,result)=>{
//         if(error){
//             console.log("Error occured : ",error);
//             console.log("Error while Registration");
//             response.render("register",{msg:"Error while Registration"});
//         }else{
//             console.log("Result : ",result);
//             console.log("Registration Successfull");
//             response.render("login",{msg:"Registration Successfull"});
//         }
//     });
// };

export const userRegistration = (request,response)=>{
    console.log(request.body);
    
    con.query(queries.insertQuery,insertValues(request),(error,result)=>{
        if(error){
            console.log("Error occured : ",error);
            console.log("Error while Registration");
            response.render("register",{msg:"Error while Registration"});
        }else{
            console.log("Result : ",result);
            console.log("Registration Successfull");
            response.render("login",{msg:"Registration Successfull"});
        }
    });
};

export const userLogin = (request,response)=>{
    console.log(request.body);
    const email = request.body.email;
    const password = request.body.password;

    if(email==="admin@gmail.com" && password==="admin@123"){
        request.session.email = request.body.email;
        request.session.save();
        response.render("adminProfile",{email : request.session.email});
    }else{

        var selectQuery = "select * from users where email=? and password=?";
        var selectValues = [email,password];
        con.query(selectQuery,selectValues,(error,result)=>{
            if(error)
                console.log("Error occured while login : ",error);
            else{
                // console.log("user : ",result);
                request.session.email = request.body.email;
                request.session.save();
                response.render("userProfile",{msg:"",email : request.session.email});        
            }           
        });
    }

}
export const userUpdateController = (request,response)=>{
    var email = request.params.email;
    //console.log("email : ",email);
    var selectQuery = `select * from users where email='${email}'`;
    //console.log("select query : ",selectQuery);
    con.query(selectQuery,(error,result)=>{
        if(error)
            console.log("Error while getting data from email : "+error);
        else{
            //console.log("received data : ",result);
             response.render("userUpdateForm",{userData : result[0],email:request.session.email});
        }
    });
}

export const updateUserController = (request,response)=>{
    const {username,email,password,address}=request.body;
    var updateQuery = "update users set username=?, password=?,address=? where email=?";
    var updateValues = [username,password,address,email];
    con.query(updateQuery,updateValues,(error,result)=>{
        if(error)
            console.log("Error occured : ",error);
        else{
            //console.log("Updated result : ",result);
            if (result.affectedRows == 1) {
                response.render("userProfile", {msg:"Profile updated successfully",email: request.session.email});
            }else{
                response.render("userProfile", {msg:"Error while updating profile",email: request.session.email});
            }
        }
    });
}


export const userLogoutController = (request, response) => {
    request.session.email = "";
    request.session.destroy();
    response.redirect("/");
}