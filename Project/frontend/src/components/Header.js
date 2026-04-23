import logo from '../public/images/logo.jpg'
function Header(){
    return(<nav style={{position:"sticky",top:0,zIndex:999}} className="navbar navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src={logo} alt="" style={{width:"30px",height:"30px"}} className="d-inline-block align-text-top"/>
      <span className='fw-bold'>MobileKart</span>
    </a>
    <span class="navbar-text" style={{fontSize:"14px"}}>
        VijayNagar, Indore
        M.P., 452010        
    </span>
  </div>
</nav>);
}
export default Header;