import { useState } from 'react';
import banner from '../public/images/login1.jpg';
import { useDispatch } from 'react-redux';
import {useNavigate} from 'react-router-dom';
import { loginThunk } from '../store/loginSlice.js';
function Login(){
    const [obj,setObj] = useState({});
    const dispatch = useDispatch();
    const navigate = useNavigate(); 
    const getData = (event)=>{
        const {name,value} = event.target;
        setObj({
            ...obj,
            [name]:value
        });
    }
    const handleSubmit = (event)=>{
        event.preventDefault();
        dispatch(loginThunk(obj));
        event.target.reset();
    }
    return(<div className="row p-5">
        <div className="col-lg-6">
            <img src={banner} className='d-block w-100' alt="Image"/>
        </div>
        <div className="col-lg-6 p-5">
            <h4>Login Form</h4>
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