function setData(){
    var username = document.getElementById("username");
    var email = document.getElementById("email");
    var password = document.getElementById("password");
    var address = document.getElementById("address");

    var obj = {
        username:username.value,
        email:email.value,
        password:password.value,
        address:address.value
    };
    var data = JSON.parse(localStorage.getItem("data"));
    // alert(data);
    if(!data){
        // localStorage.setItem("data",JSON.stringify([...data||[],obj]));
        localStorage.setItem("data",JSON.stringify([obj]));
    }else{
        var userObj = data.find((user)=>user.email==obj.email);
        // console.log(userObj);
        if(userObj){
            alert("Email-Id already Exist | Please register by another email id");
        }else{
             localStorage.setItem("data",JSON.stringify([...data,obj]));    
        }
    }
}

function checkLogin(){
    var email = document.getElementById("email");
    var password = document.getElementById("password");

    var obj = {
        email:email.value,
        password:password.value,
    };
    var data = JSON.parse(localStorage.getItem("data"));
        var userObj = data.find((user)=>user.email==obj.email && user.password==obj.password);
        // console.log(userObj);
        if(userObj){
            sessionStorage.setItem("email",obj.email);
            alert("Login Successfull");
            return true;
        }else{
             alert("Credential Not Matched");
            return false;
        }
}