import { useState } from "react";
import '../style.css';
import { useDispatch } from "react-redux";
import { useNavigate } from "react-router-dom";
import { loginStudent, loginStudentThunk } from "../store/studentSlice.js";
import axios from "axios";
import { requestedURL } from "../utils.js";
function Login(){
    const [student,setStudent] = useState();
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const getData = (event)=>{
        const {name,value} = event.target;
        setStudent({
            ...student,
            [name]:value
        });
    }
    // const handleSubmit = async (event)=>{
    //     try{
    //         event.preventDefault();
    //         const result = await axios.post(requestedURL+'/login',student);
    //         console.log("Result : ",result);
    //         if(result.status==201)
    //             navigate('/viewStudents');
    //         //dispatch(loginStudent(student));            
    //     }catch(error){
    //         console.log("Error occured in Login.js file");
    //     }
    // }

    const handleSubmit = async (event)=>{
        try{
            event.preventDefault();
            dispatch(loginStudentThunk(student));            
            navigate('/viewStudents');
        }catch(error){
            console.log("Error occured in Login.js file");
        }
    }

    return (<>
        <h1>Login Form</h1>
        <form action="" onSubmit={handleSubmit}>
        <input
            type='email'
            name='email'
            placeholder="Enter Email"
            onChange={getData}
        /><br/>
        <input
            type='password'
            name='password'
            placeholder="Enter Password"
            onChange={getData}
        /><br/>
        <input
            type='submit'
            value='Submit'
        /><br/>
        </form>
    </>);
}

export default Login;