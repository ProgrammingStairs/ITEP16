import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { Link } from "react-router-dom";
import { logoutStudent } from "../store/studentSlice";
function Navbar(){
    const [menuItem,setMenuItem] = useState();    
    const navShow = useSelector(state=>state.student.navShow);
    const dispatch = useDispatch();    
    useEffect(()=>{
        if(navShow=="home"){
            setMenuItem(<div style={{backgroundColor:"black",color:"white",padding:"10px"}}>
                <Link style={{color:"white",textDecoration:"none"}} to='/'>Home</Link> &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
                <Link style={{color:"white",textDecoration:"none"}} to='/loginStudent'>Login</Link> &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
                <Link style={{color:"white",textDecoration:"none"}} to='/addStudent'>Add Student</Link>
            </div>);
        }else if(navShow=="login"){
            setMenuItem(<div style={{backgroundColor:"black",color:"white",padding:"10px"}}>
                <Link style={{color:"white",textDecoration:"none"}} to='/'>Home</Link> &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
                <Link style={{color:"white",textDecoration:"none"}} to='/viewStudents'>View Students</Link> &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
                <Link style={{color:"white",textDecoration:"none"}} to='/logout' onClick={()=>{dispatch(logoutStudent())}}>Logout</Link>
            </div>);
        }
    },[navShow]);

    return (<>
        {menuItem}
    </>);
}

export default Navbar;