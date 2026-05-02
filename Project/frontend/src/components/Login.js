import { useEffect, useState } from 'react';
import banner from '../public/images/login1.jpg';
import { useDispatch } from 'react-redux';
import {useLocation, useNavigate} from 'react-router-dom';
import { loginThunk } from '../store/loginSlice.js';
function Login(){
    const [obj,setObj] = useState({});
    const dispatch = useDispatch();
    const navigate = useNavigate(); 
    const [msg,setMsg] = useState('');
    const location = useLocation();
    const getData = (event)=>{
        const {name,value} = event.target;
        setObj({
            ...obj,
            [name]:value
        });
    }
    useEffect(()=>{
        const param_url = new URLSearchParams(location.search);
        const message = param_url.get("message");

        if(message=="Invalid_Token")
            setMsg("Invalid Token");
        else if(message=="Seller_Not_Found")
            setMsg("Seller Not Found");
        else if(message=="Wait_for_admin_approval")
            setMsg("Wait For Admin Approval");
        
    },[location.search]);

    const handleSubmit = async(event)=>{
        event.preventDefault();
        try{
            const data = await dispatch(loginThunk(obj)).unwrap();
            // console.log("-----------data : ",data);
            if(data.role=="ROLE_ADMIN")
                navigate('/admin/adminHome');
            else if(data.role=="ROLE_USER")
                navigate('/user/userHome');
            else if(data.role=="ROLE_SELLER")
                navigate('/seller/sellerHome');
        }catch(error){
            console.log("......error : ",error);
            setMsg('Something Went Wrong');
        }
        event.target.reset();
    }
    return(<div className="row p-5">
        <div className="col-lg-6">
            <img src={banner} className='d-block w-100' alt="Image"/>
        </div>
        <div className="col-lg-6 p-5">
            <h4>Login Form</h4>
            {location.state?.message ? location.state.message : ''}
            {msg}
            <form onSubmit={handleSubmit} method="post">
  <div class="mb-3">
    <label class="form-label">Email address</label>
    <input 
        type="email" 
        class="form-control" 
        name="email"
        placeholder='Enter Email'
        onChange={getData}    
    />
  </div>
  <div class="mb-3">
    <label class="form-label">Password</label>
    <input 
        type="password" 
        class="form-control" 
        name="password"
        placeholder='Enter Password'
        onChange={getData}    
    />
  </div>
  <button type="submit" class="btn btn-dark w-100">Login</button>
</form>
        </div>
    </div>);
}
export default Login;