import con from "../model/connection.js";

export const adminViewUserController = (request, response) => {
    var userListQuery = "select * from users";
    con.query(userListQuery, (error, result) => {
        if (error)
            console.log("Error occured in user list");
        else {
            console.log("User List : ", result);
            response.render("adminUserList", { userList: result, email: request.session.email, msg: "" });
        }
    });
}

export const adminDeleteUserController = (request, response) => {
    const email = request.params.email;
    console.log("email : ", email);
    var deleteQuery = "delete from users where email=?";
    var deleteValue = [email];
    con.query(deleteQuery, deleteValue, (error, result) => {
        if (error)
            console.log("Error while deleting user");
        else {
            console.log("result : ", result);
            if (result.affectedRows != 0) {
                var userListQuery = "select * from users";
                con.query(userListQuery, (error, result) => {
                    if (error)
                        console.log("Error occured in user list");
                    else {
                        console.log("User List : ", result);
                        response.render("adminUserList", {msg: "User Deleted Successfully", userList: result, email: request.session.emai});
                    }
                });
            }else{
                var userListQuery = "select * from users";
                con.query(userListQuery, (error, result) => {
                    if (error)
                        console.log("Error occured in user list");
                    else {
                        console.log("User List : ", result);
                        response.render("adminUserList", {msg: "Error while deleting user", userList: result, email: request.session.email});
                    }
                });
            }
        }
    });
}

export const adminUpdateUserController = (request,response)=>{
    var email = request.params.email;
    //console.log("email : ",email);
    var selectQuery = `select * from users where email='${email}'`;
    //console.log("select query : ",selectQuery);
    con.query(selectQuery,(error,result)=>{
        if(error)
            console.log("Error while getting data from email : "+error);
        else{
            //console.log("received data : ",result);
             response.render("adminUserUpdateForm",{userData : result[0],email:request.session.email});
        }
    });
}

export const adminUserUpdateController = (request,response)=>{
    const {username,email,password,address}=request.body;
    var updateQuery = "update users set username=?, password=?,address=? where email=?";
    var updateValues = [username,password,address,email];
    con.query(updateQuery,updateValues,(error,result)=>{
        if(error)
            console.log("Error occured : ",error);
        else{
            //console.log("Updated result : ",result);
            if (result.affectedRows == 1) {
                var userListQuery = "select * from users";
                con.query(userListQuery, (error, result) => {
                    if (error)
                        console.log("Error occured in user list");
                    else {
                       // console.log("User List : ", result);
                        response.render("adminUserList", {msg: "User Profile Updated Successfully", userList: result, email: request.session.email});
                    }
                });
            }else{
                var userListQuery = "select * from users";
                con.query(userListQuery, (error, result) => {
                    if (error)
                        console.log("Error occured in user list");
                    else {
                        console.log("User List : ", result);
                        response.render("adminUserList", {msg: "Error while updating User Profile", userList: result, email: request.session.email});
                    }
                });
            }
        }
    });
}

export const adminLogoutController = (request, response) => {
    request.session.email = "";
    request.session.destroy();
    response.redirect("/");
}