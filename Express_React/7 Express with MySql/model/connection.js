import mysql from "mysql2";
const con = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"root",
    database:"expressdb"
});

con.connect((error)=>{
    if(error)
        console.log("Error while connect");
    else
        console.log("Connected to MySql Database");
});

export default con;