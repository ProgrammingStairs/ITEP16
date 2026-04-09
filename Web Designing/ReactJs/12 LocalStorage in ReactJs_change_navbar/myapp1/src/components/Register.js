import { useEffect, useState } from "react";

function Register(){
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