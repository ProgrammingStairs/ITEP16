import { useEffect, useState } from "react";
import { useLocation, useNavigate } from "react-router-dom";
function Login(){
    const [userObj,setUserObj] = useState({});
    const location = useLocation();
    const navigate = useNavigate();
    const getData = (event)=>{
        const {name,value} = event.target;
        setUserObj({
            ...userObj,
            [name]:value
        });
    }
    const handleSubmit = (event)=>{
        event.preventDefault();
        var existingData = JSON.parse(localStorage.getItem("data"));
        var res = existingData.find(obj=> obj.email==userObj.email && obj.password==userObj.password);
        if(res){
            localStorage.setItem("loggedInEmail",userObj.email);
            navigate("/profile",{
                state:{
                    email : userObj.email
                }
            });
        }else{
            navigate("/login",{
                state:{
                    message:"Credentials Not Matched"
                }
            });
        }
        event.target.reset();
    }
    useEffect(()=>{
        localStorage.setItem("navShow","login");
    },[]);
    return (<blockquote>
        <h2>Login</h2>
        {/* {console.log(location.state?.message)} */}
        {location.state?.message ? location.state.message : ''}
        <form onSubmit={handleSubmit}>
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
                type="submit"
                value="Login"
            />
            <input
                type="reset"
                value="Reset"
            /> <br/>
        </form>
    </blockquote>);}
export default Login;