import { useEffect, useState } from "react";
import { useSelector } from "react-redux";
import { Link } from "react-router-dom";
function Navbar(){
    const navShow = useSelector(state=> state.common.navShow)
    const [menuItem,setMenuItem]=useState();
    useEffect(()=>{
       // const timer = setInterval(()=>{
          if(navShow=="home"){
              setMenuItem(<>
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
              </>)
        }else if(navShow=="admin"){
              setMenuItem(<>
                <li className="nav-item">
                  <Link className="nav-link active" aria-current="page" to="/admin/adminHome">Home</Link>
                </li>
                <li className="nav-item ">
                  <Link className="nav-link text-white" to='/admin/sellerList'>Seller</Link>
                </li>
                <li className="nav-item ">
                  <Link className="nav-link text-white" to='/'>User</Link>
                </li>
                <li className="nav-item ">
                  <Link className="nav-link text-white" to='/'>Mobile</Link>
                </li>
                <li className="nav-item ">
                  <Link className="nav-link text-white" to='/'>Mobile Variant</Link>
                </li>
                <li className="nav-item ">
                  <Link className="nav-link text-white" to='/'>Logout</Link>
                </li>
              </>)
        }else if(navShow=="user"){
              setMenuItem(<>
                <li className="nav-item">
                  <Link className="nav-link active" aria-current="page" to="/user/userHome">Home</Link>
                </li>
                <li className="nav-item ">
                  <Link className="nav-link text-white" to='/'>MobileList</Link>
                </li>
                <li className="nav-item ">
                  <Link className="nav-link text-white" to='/'>Order</Link>
                </li>
                <li className="nav-item ">
                  <Link className="nav-link text-white" to='/'>Profile</Link>
                </li>
                <li className="nav-item ">
                  <Link className="nav-link text-white" to='/'>Update Password</Link>
                </li>
                <li className="nav-item ">
                  <Link className="nav-link text-white" to='/'>Logout</Link>
                </li>
              </>)
        }
        // },1000);
        //     return ()=> clearInterval(timer);
    },[navShow]);
    return(<>
    <nav style={{position:"sticky",top:"58px",zIndex:999}} className="navbar navbar-expand-lg navbar-dark bg-dark">
  <div className="container-fluid">
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">

        {menuItem}

     </ul>
        <span class="navbar-text fw-bold text-white">
            mobileKart@gmail.com
        </span>
    </div>
  </div>
</nav>
    
    </>);
}
export default Navbar;