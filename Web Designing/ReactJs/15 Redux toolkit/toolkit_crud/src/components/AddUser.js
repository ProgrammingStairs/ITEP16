import { useState } from "react";
import '../style.css';
import { addUser } from "../store/userSlice.js";
import { useDispatch, useSelector } from "react-redux";
import { useNavigate } from "react-router-dom";
function AddUser(){
    const stateUserObj = useSelector(state=>state.user.userObj); 
    const navigate = useNavigate();   
    // console.log("=-=-=-=-=-=-=-= : ",Object.keys(stateUserObj).length === 0);
    var status = Object.keys(stateUserObj).length === 0;

    const [userObj,setUserObj] = useState(status ? {} : stateUserObj);
    const dispatch = useDispatch();
    const getData = (event)=>{
        const {name,value} = event.target;
        setUserObj({
            ...userObj,
            [name]:value
        });
    }
    const handleSubmit = (event)=>{
        event.preventDefault();
        dispatch(addUser(userObj));
        setUserObj({});
        navigate("/viewUsers");
    }
    return (<>
        <blockquote>
            <h2>{status ? "Add User Details" : "Update User Details"}</h2>
            <form onSubmit={handleSubmit}>
            <input
                type="text"
                placeholder="Enter Username"
                name="username"
                id="username"
                required
                value={userObj.username}
                onChange={getData}
            /> <br/>
            <input
                type="email"
                placeholder="Enter Email"
                name="email"
                id="email"
                required
                value={userObj.email}
                onChange={getData}
            /> <br/>
            <input
                type="password"
                placeholder="Enter Password"
                name="password"
                id="password"
                required
                value={userObj.password}
                onChange={getData}
            /> <br/>
            <input
                type="text"
                placeholder="Enter Address"
                name="address"
                id="address"
                required
                value={userObj.address}
                onChange={getData}
            /> <br/>
            <input
                type="submit"
                value={status ? "Add User" : "Update User"}
            /> <br/>
            <input
                type="reset"
                value="Reset"
            />
            </form>
        </blockquote>
    </>);
}
export default AddUser;