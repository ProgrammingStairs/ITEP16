import { useDispatch } from 'react-redux';
import banner from '../public/images/register.jpg';
import { useNavigate } from 'react-router-dom';
import { userRegistrationThunk } from '../store/userSlice.js';
import { useState } from 'react';
function UserRegister() {
    const [userObj,setUserObj] = useState();
    const [msg,setMsg] = useState();
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const getData = (event)=>{
        const {name,value} = event.target;
        setUserObj({
            ...userObj,
            [name]:value
        })
    }
    const handleSubmit = async(event)=>{
        event.preventDefault();
        try{    
            const data = await dispatch(userRegistrationThunk(userObj)).unwrap();
            if(data.status==200)
                navigate('/login');
            else
                setMsg('Error in User Registration');    
        }catch(error){
            console.log("Error : ",error);
            setMsg('Something Went Wrong');
        }
        event.target.reset();
    }
    return (<div className="row p-5">
        <div className="col-lg-4">
            <img src={banner} className='d-block w-100' alt="Image" />
        </div>
        <div className="col-lg-8 row">
            <h4>Register Form | User</h4>
            <form className="form-control" onSubmit={handleSubmit} method="post">
                <div style={{ height: "auto", float: "left", marginLeft: "40px" }} className='col-lg-5'>
                    <div class="mb-3">
                        <label class="form-label">Username</label>
                        <input
                            type="text"
                            class="form-control"
                            name="name"
                            placeholder='Enter Username'
                            onChange={getData}
                        />
                    </div>
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

                </div>
                <div style={{ height: "auto", float: "left", marginLeft: "40px" }} className='col-lg-5'>
   <div class="mb-3">
                        <label class="form-label">Contact</label>
                        <input
                            type="text"
                            class="form-control"
                            name="contact"
                            placeholder='Enter 10-Digit Mobile No.'
                            onChange={getData}
                        />
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Gender : &nbsp;</label>
                        <input
                            type="radio"
                            class="radio-inline"
                            name="gender"
                            id="male"
                            value="Male"
                            onChange={getData}
                        /><label for="male">&nbsp;Male&nbsp;</label>
                        <input
                            type="radio"
                            class="radio-inline"
                            name="gender"
                            id="female"
                            value="Female"
                            onChange={getData}
                        /><label for="male">&nbsp;Female&nbsp;</label>
                    </div>
                </div>
                <button type="submit" class="btn btn-dark w-100">Register</button>
            </form>
        </div>

    </div>);
}
export default UserRegister;