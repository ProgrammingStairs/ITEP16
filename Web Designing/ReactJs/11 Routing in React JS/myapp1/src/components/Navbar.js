import {Link} from 'react-router-dom';
function Navbar(){
    return (<blockquote>
        <div style={{backgroundColor:"black",color:"white",padding:"5px"}}>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/">Home</Link>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/about">About</Link>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/contact">Contact</Link>
        </div>
    </blockquote>);
}
export default Navbar;