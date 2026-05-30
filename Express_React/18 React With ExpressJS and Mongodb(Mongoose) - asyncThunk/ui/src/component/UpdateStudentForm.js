import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { addStudent, updateStudentThunk } from "../store/studentSlice";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import { requestedURL } from "../utils.js";

function UpdateStudentForm(){
    const [student,setStudent] = useState();
    const studentData = useSelector(state=>state.student.selectedStudent);
    const dispatch = useDispatch();
    const navigate = useNavigate();
    useEffect(()=>{
        setStudent(studentData);
    },[studentData]);
    const getData = (event)=>{
        const {name,value} = event.target;
        setStudent({
            ...student,
            [name]:value
        });
    }
    // const handleUpdate = async(event)=>{
    //     event.preventDefault();
    //     const result = await axios.post(requestedURL+'/updateStudent',student);
    //     console.log("result : ",result);
    //     //dispatch(addStudent(student));
    //     if(result.status==201)
    //         navigate('/viewStudents');
    // }

    const handleUpdate = async(event)=>{
        event.preventDefault();
        dispatch(updateStudentThunk(student));
        navigate('/viewStudents');
    }

    return (<>
        <h1>Update Student Form</h1>
        <form action='' onSubmit={handleUpdate}>
            <input 
                type='text'
                name='username'
                defaultValue={studentData.username}
                placeholder="Enter Username"
                onChange={getData}
            /><br/>
            <input 
                type='email'
                name='email'
                readOnly
                defaultValue={studentData.email}
                placeholder="Enter Email"
                onChange={getData}
            /><br/>
            <input 
                type='text'
                name='password'
                defaultValue={studentData.password}
                placeholder="Enter Password"
                onChange={getData}
            /><br/>
            <input 
                type='text'
                name='address'
                defaultValue={studentData.address}
                placeholder="Enter Address"
                onChange={getData}
            /><br/>
            <input 
                type='submit'
                value='Update'
            /><br/>
        </form>
    </>);
}

export default UpdateStudentForm;

/*
https://chatgpt.com/c/674f6359-aff8-8001-9803-a76b8bf0382e

useState student se value attribute se edit ho jaegi fields, but redux state are immutable, see link above.
            <input 
                type='text'
                name='username'
                value={student.username}
                placeholder="Enter Username"
                onChange={getData}
            /><br/>

*/

/*
https://chatgpt.com/c/674f736e-fb24-8001-bce8-20e59c526416
*/