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
        console.log("You selected : ",option);
        // switch(option){}
    });
}
