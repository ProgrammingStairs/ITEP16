var mysql = require("mysql2");
const con = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"root",
    database:"itep16_mysql"
});

con.connect((error)=>{
    if(error)
        console.log("Something went wrong : ",error);
    else 
        console.log("Connection established successfully");
})