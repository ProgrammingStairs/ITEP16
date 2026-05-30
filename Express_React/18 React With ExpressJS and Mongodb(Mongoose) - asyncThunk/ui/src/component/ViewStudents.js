import { useDispatch, useSelector } from "react-redux";
import { deleteStudent, deleteStudentThunk, loginStudentThunk, updateStudent, viewStudentThunk } from "../store/studentSlice.js";
import { useNavigate } from "react-router-dom";
import { useEffect, useState } from "react";
import { requestedURL } from "../utils.js";
import axios from "axios";
function ViewStudents(){
    const students = useSelector(state=>state.student.students);    
    //const [students,setStudents] = useState([]);
    const dispatch = useDispatch();
    const navigate = useNavigate();
    
    // useEffect(()=>{
    //     async function fetchStudent(){
    //         try{
    //             const students = await axios.get(requestedURL+'/viewStudentList');
    //             console.log("students : ",students.data.studentList);
    //             setStudents(students.data.studentList);
    //         }catch(error){
    //             console.log("Error occured in ViewStudent.js file : ",error);
    //         }
    //     }
    //     fetchStudent();
    // },[students]);


    useEffect(()=>{
        dispatch(viewStudentThunk());
    },[]);

    const handleUpdate = (obj)=>{
        dispatch(updateStudent(obj));
        navigate('/updateStudentForm');
    }
    const deleteStudent = (obj)=>{
        try{
            dispatch(deleteStudentThunk(obj));
            //navigate('/viewStudents');
        }catch(error){
            console.log("Error in viewStudent.js file");
        }
    }
    return (<>
        <h1>Student List</h1>
        <table border='1' cellspacing='0' cellpadding='6'>
            <tr>
                <th>S.No</th>
                <th>Username</th>
                <th>Email</th>
                <th>Address</th>
                <th colspan='2'>Action</th>
            </tr>
            {
                students.map((stud,index)=>{
                    return (<tr>
                         <td>{index+1}</td>
                         <td>{stud.username}</td>
                         <td>{stud.email}</td>
                         <td>{stud.address}</td>
                         <td><button onClick={()=>{handleUpdate({stud,index})}}>Update</button></td>
                         {/* <td><button onClick={()=>{dispatch(deleteStudent(index))}}>Delete</button></td>    */}
                         <td><button onClick={()=>{deleteStudent({stud,index})}}>Delete</button></td>   
                    </tr>)
                })
            }
        </table>
    </>);
}

export default ViewStudents;