import { Link, Outlet, useLocation } from "react-router-dom";
function Contact(){
    const location = useLocation();
    const status = location.pathname!='/contact';
    // {console.log(status);}
    return (<blockquote>
          <div style={{marginTop:"-16px",marginLeft:"130px",width:"150px",backgroundColor:"black",color:"white",padding:"5px"}}>
            <hr/>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/contact/contactComp1">ContactCompI</Link> <br/><hr/>
            <Link style={{color:"white",textDecoration:"none",margin:"15px"}} to="/contact/contactComp2">ContactCompII</Link>
            <hr/>
        </div>
        { 
            status ? <Outlet/> : (<>
                <h2>Contact Page</h2>
                <p>
                    It is a long established when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).
                </p>
            </>) 
        }
        
    </blockquote>); 
}
export default Contact;