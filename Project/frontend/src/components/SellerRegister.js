import { useState } from 'react';
import banner from '../public/images/register1.jpg';
import { useDispatch } from 'react-redux';
import { sellerRegistrationThunk } from '../store/sellerSlice.js';
import { useNavigate } from 'react-router-dom';
function SellerRegister() {
    const[sellerObj,setSeller] = useState();
    const[msg,setMsg]=useState();
    const dispatch = useDispatch();
    const navigate = useNavigate();
    const getData = (event)=>{
        const {name,value} = event.target;
        setSeller({
            ...sellerObj,
            [name]:value
        });
    }
    const handleSubmit = async(event)=>{
        event.preventDefault();
        const data = await dispatch(sellerRegistrationThunk(sellerObj)).unwrap();
        if(data.status==200)
            navigate("/login",{
                state:{
                    message : data.message
                }
            });
        else 
            setMsg("Something Went Wrong");
        event.target.reset();
    }
    return (<div className="row p-5">
        <div className="col-lg-4">
            <img src={banner} className='d-block w-100' alt="Image" />
        </div>
        <div className="col-lg-8 row">
            <h4>Register Form | Seller</h4>
            {msg}
            <form className="form-control" onSubmit={handleSubmit}>
                <div style={{ height: "auto", float: "left", marginLeft: "40px" }} className='col-lg-5'>
                    <div class="mb-3">
                        <label class="form-label">ShopName</label>
                        <input
                            type="text"
                            class="form-control"
                            name="shopname"
                            placeholder='Enter Shop Name'
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
                    <div class="mb-3">
                        <label class="form-label">Contact</label>
                        <input
                            type="text"
                            class="form-control"
                            name="contact"
                            placeholder='Enter 10-Digit Contact No.'
                            onChange={getData}
                        />
                    </div>

                </div>
                <div style={{ height: "auto", float: "left", marginLeft: "40px" }} className='col-md-12 col-lg-5'>
                    <div class="mb-3">
                        <label class="form-label">GST Number</label>
                        <input
                            type="text"
                            class="form-control"
                            name="gstno"
                            placeholder='Enter GST Number'
                            onChange={getData}
                        />
                    </div>

                    <div class="mb-3">
                        <label class="form-label">PAN Number</label>
                        <input
                            type="text"
                            class="form-control"
                            name="panno"
                            placeholder='Enter PAN Number'
                            onChange={getData}
                        />
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Address</label>
                        <input
                            type="text"
                            class="form-control"
                            name="address"
                            placeholder='Enter Address'
                            onChange={getData}
                        />
                    </div>
                    <div class="mb-3">
                        <label class="form-label">BankAccount Number</label>
                        <input
                            type="text"
                            class="form-control"
                            name="accountno"
                            placeholder='Enter Bank Account Number'
                            onChange={getData}
                        />
                    </div>


                </div>

                <button type="submit" class="btn btn-dark w-100">Register</button>

            </form>
        </div>

    </div>);
}
export default SellerRegister;