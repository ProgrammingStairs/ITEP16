import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

function Register(){
    const [userObj,setUserObj] = useState({});
    const navigate = useNavigate();
    const [userArray,setUserArray] = useState([]);
    const getData = (event)=>{
        const {name,value} = event.target;
        setUserObj({
            ...userObj,
            [name]:value
        });
    }
    const handleSubmit = (event)=>{
        event.preventDefault();
        const data = JSON.parse(localStorage.getItem("data"));
        if(!data){
            localStorage.setItem("data",JSON.stringify([userObj]));
            navigate("/login",{
                    state:{
                        message : "Registration successful"
                    }
                });
        }else{
            var existingData = JSON.parse(localStorage.getItem("data"));
            var res = existingData.find(obj=> obj.email==userObj.email);
            // console.log("-------------------- : ",res);
            if(!res){
                localStorage.setItem("data",JSON.stringify([...existingData,userObj]));
                navigate("/login",{
                    state:{
                        message : "Registration successful"
                    }
                });
            }
            else 
                alert("Email Id already exist");
        }
        event.target.reset();
    }
        useEffect(()=>{
            localStorage.setItem("navShow","register");
        },[]);
    
    return (<blockquote>
        <h2>Register</h2>
        <form onSubmit={handleSubmit}>
            <input
                type="text"
                placeholder="Enter Username"
                id="username"
                name="username"
                required
                onChange={getData}
            /> <br/>
            <input
                type="email"
                placeholder="Enter Email"
                id="email"
                name="email"
                required
                onChange={getData}
            /> <br/>
            <input
                type="password"
                placeholder="Enter Password"
                id="password"
                name="password"
                required
                onChange={getData}
            /> <br/>
            <input
                type="text"
                placeholder="Enter Address"
                id="address"
                name="address"
                required
                onChange={getData}
            /> <br/>
            <input
                type="submit"
                value="Register"
            />
            <input
                type="reset"
                value="Reset"
            /> <br/>
        </form>
    </blockquote>);
}
export default Register;