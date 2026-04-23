import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
function Navbar(){
    const [menuItem,setMenuItem]=useState();
    useEffect(()=>{
        const timer = setInterval(()=>{
            setMenuItem(<nav style={{position:"sticky",top:"58px",zIndex:999}} className="navbar navbar-expand-lg navbar-dark bg-dark">
  <div className="container-fluid">
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
        <li className="nav-item">
          <Link className="nav-link active" aria-current="page" to="/">Home</Link>
        </li>
        <li className="nav-item ">
          <Link className="nav-link text-white" to='/about'>About</Link>
        </li>
        <li className="nav-item ">
          <Link className="nav-link text-white" to='/contact'>Contact</Link>
        </li>
        <li className="nav-item ">
          <Link className="nav-link text-white" to='/services'>Services</Link>
        </li>
        <li className="nav-item ">
          <Link className="nav-link text-white" to='/seller/register'>Seller</Link>
        </li>
        <li className="nav-item ">
          <Link className="nav-link text-white" to='/user/register'>User</Link>
        </li>
        <li className="nav-item ">
          <Link className="nav-link text-white" to='/login'>Login</Link>
        </li>

      </ul>
        <span class="navbar-text fw-bold text-white">
            mobileKart@gmail.com
        </span>
    </div>
  </div>
</nav>)
        });
    },[]);
    return(<>
        {menuItem}
    </>);
}
export default Navbar;