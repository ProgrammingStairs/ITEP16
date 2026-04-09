import { useEffect, useState } from 'react';
import {Link} from 'react-router-dom';
function Navbar(){
    const [menuItem,setMenuItem] = useState();
    useEffect(()=>{
        setInterval(()=>{
            const navShow = localStorage.getItem("navShow");
            if(navShow=="home"){
                setMenuItem(<div style={{backgroundColor:"black",color:"white",padding:"5px"}}>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/">Home</Link>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/about">About</Link>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/contact">Contact</Link>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/login">Login</Link>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/register">Register</Link>
        </div>);
            }else if(navShow=="login"){
                setMenuItem(<div style={{backgroundColor:"black",color:"white",padding:"5px"}}>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/">Home</Link>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/register">Register</Link>
        </div>);
            }else if(navShow=="register"){
                setMenuItem(<div style={{backgroundColor:"black",color:"white",padding:"5px"}}>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/">Home</Link>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/login">Login</Link>
        </div>);
            }
        },200);
    },[]);
    return (<blockquote>
        {menuItem}
    </blockquote>);
}
export default Navbar;