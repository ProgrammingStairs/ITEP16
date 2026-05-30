import { useState } from "react";
import '../style.css';
import { useDispatch } from "react-redux";
import { addStudent, addStudentThunk } from "../store/studentSlice.js";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import { requestedURL } from "../utils.js";
function AddStudent(){
    const [student,setStudent] = useState({});
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
    //         const result = await axios.post(requestedURL+'/addStudent',student);
    //         console.log("Result : ",result);
    //         if(result.status==201)
    //             navigate('/loginStudent');
    //         //dispatch(addStudent(student));            
    //     }catch(error){
    //         console.log("Error occured in AddStudent.js file");
    //     }
    // }

    const handleSubmit = async (event)=>{
        try{
            event.preventDefault();
            dispatch(addStudentThunk(student)); 
            navigate('/loginStudent');           
        }catch(error){
            console.log("Error occured in AddStudent.js file");
        }
    }
    
    return (<>
        <h1>Add Student Form</h1>
        <form action='' onSubmit={handleSubmit}>
            <input 
                type='text'
                name='username'
                placeholder="Enter Username"
                onChange={getData}
            /><br/>
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
                type='text'
                name='address'
                placeholder="Enter Address"
                onChange={getData}
            /><br/>
            <input 
                type='submit'
                value='Submit'
            /><br/>
        </form>
    </>);
}

export default AddStudent;