import con from "./connection.js";

export const createDb = (request,response,next)=>{
    console.log("gets entry");
    var checkQuery = "SELECT count(*) as exist FROM information_schema.tables WHERE table_schema = 'expressdb' AND table_name = 'users'";
    con.query(checkQuery,(error,result)=>{
        if(error)
            console.log("Error occured");
        else{
            console.log("Result : ",result);
            if(result[0].exist==0){
                const createTable = "create table users(username varchar(255) not null,email varchar(255) not null primary key, password varchar(255) not null,address varchar(255) not null)";
                con.query(createTable,(error,result)=>{
                    if(error)
                        console.log("Error occured while creating table");
                    else{
                        console.log("Result of table : ",result);
                        console.log("Table created successfully");
                    }
                });
            }else{
                console.log("Table already created");
            }
        }
    });
    next();
}