import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
function Navbar(){
    const [menuItem,setMenuItem] = useState();
    useEffect(()=>{
        const timer = setInterval(()=>{
            setMenuItem(<div style={{backgroundColor:"black",padding:"15px"}}>
                <Link style={{fontSize:"22px",color:"white",textDecoration:"none",marginLeft:"40px"}} to="/">Home</Link>    |   
                <Link style={{fontSize:"22px",color:"white",textDecoration:"none",marginLeft:"40px"}} to="/addUser">Add User</Link>    |   
                <Link style={{fontSize:"22px",color:"white",textDecoration:"none",marginLeft:"40px"}} to="/viewUsers">View Users</Link>    
            </div>)
        },500);
    },[]);
    return(<>
        {menuItem}
    </>);
}
export default Navbar;