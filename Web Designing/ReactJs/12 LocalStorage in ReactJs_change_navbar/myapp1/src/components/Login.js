import { useEffect, useState } from "react";
function Login(){
    const [userObj,setUserObj] = useState({});
    const getData = (event)=>{
        const {name,value} = event.target;
        setUserObj({
            ...userObj,
            [name]:value
        });
    }
    const handleSubmit = (event)=>{
        event.preventDefault();

        event.target.reset();
    }
    useEffect(()=>{
        localStorage.setItem("navShow","login");
    },[]);
    return (<blockquote>
        <h2>Login</h2>
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