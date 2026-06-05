var mysql = require("mysql2");
var readLine = require("readline");
const con = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"root",
    database:"itep16_mysql"
});

const instance = readLine.createInterface({
    input:process.stdin,
    output:process.stdout
})

con.connect((error)=>{
    if(error)
        console.log("Something went wrong : ",error);
    else {
        console.log("Connection established successfully");
        showMenu();
    }
})

function showMenu(){
    instance.question("###### Select Option ######\n1 for Add Student\n2 for View All Students\n3 for Update Student by EmailId\n4 for Delete student by EmailId\n5 for Exit\nEnter Your Option : ",(option)=>{
        // console.log("You selected : ",option);
        switch(option){
            case '1' : addStudent();
                     break;
            case '2' : viewAllStudents();
                     break;
            case '3' : updateStudentByEmailId();
                     break;
            case '4' : deleteStudentByEmailId();
                     break;
            case '5' : exitStudent();
                     break;
            default:
                     console.log("Thanks For Visting..!!");
                     instance.close();
                     con.close();
                     break;                     
        }
    });
}

function addStudent(){
    try{
        instance.question("Enter username : ",(username)=>{
            instance.question("Enter email : ",(email)=>{
                instance.question("Enter password : ",(password)=>{
                    instance.question("Enter address : ",(address)=>{
                        const query = 'insert into student(username,email,password,address) values(?,?,?,?);'
                        const values = [username,email,password,address];
                        con.query(query,values,(error,result)=>{
                            if(error)
                                console.log("Error while inserting data into table");
                            else
                                console.log("Data inserted successfully");
                            showMenu();
                        });
                    })
                })  
            })    
        })
    }catch(error){
        console.log("Error occured in Add Student..",error);
    }
}

function viewAllStudents(){
    try{
        const query = "select * from student";
        con.query(query,(error,result)=>{
            if(error)
                console.log("Error occured while fetching data..",error);
            else 
                console.table(result);
            showMenu();
        })
    }catch(error){
        console.log("Error occured in viewAllStudenta : ",error);
    }
}
function updateStudentByEmailId(){
    try{
        instance.question("Enter email to update : ",(email)=>{
            const query = "select count(*) as checkEmail from student where email = ?";
            const value = [email];
            con.query(query,value,(error,result)=>{
                if(error)
                    console.log("Error while dealing with email");
                else{
                    console.log(result);
                    if(result[0].checkEmail!=0){
                    instance.question("Enter new username : ",(username)=>{
                            instance.question("Enter new password : ",(password)=>{
                                instance.question("Enter new address : ",(address)=>{
                                    const query = 'update student set username=?,password=?,address=? where email=?;'
                                    const values = [username,password,address,email];
                                    con.query(query,values,(error,result)=>{
                                        if(error)
                                            console.log("Error while updating data into table");
                                        else
                                            console.log("Data updated successfully");
                                        showMenu();
                                    });
                                })
                            })      
                    })
                    }else
                        console.log("Email Not Fount");
                    showMenu();
                }
                showMenu();    
            });
        });
    }catch(error){
        console.log("Error occured in Add Student..",error);
    }
}
function deleteStudentByEmailId(){}
function exitStudent(){}