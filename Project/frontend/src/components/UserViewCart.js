import banner from '../public/images/banner.png';
import '../public/css/style.css';
import { useDispatch, useSelector } from 'react-redux';
import { useEffect, useState } from 'react';
import { setNavShow } from '../store/commonSlice.js';
import { placeOrderThunk, removeItemThunk, viewCartThunk } from '../store/userSlice.js';
function UserViewCart() {
    const email = useSelector(state=> state.login.loggedInEmail);
    const cartArray = useSelector(state=> state.user.cartArray);
    const [msg,setMsg] = useState();
    const [addressData,setAddressData] = useState({});
    const [loggedEmail,setLoggedEmail] = useState();
    const dispatch = useDispatch();
    useEffect(()=>{
        if(email){
            localStorage.setItem("email",email);
            setLoggedEmail(email);
        }else{
            var receiveEmail = localStorage.getItem("email");
            // needs to set different names from the variable names which we use to set store data received from useSelector
            setLoggedEmail(receiveEmail);
        }
        dispatch(setNavShow("user"));
        dispatch(viewCartThunk());
    },[email]);
    const getData = (event)=>{
        const {name,value} = event.target;
        setAddressData({
            ...addressData,
            [name]:value
        })
    }
    const totalAmount = cartArray.reduce((total,item)=>{
        return total + (item.quantity * item.price);
    },0)
    const handleSubmit = async (event)=>{
        event.preventDefault();
        //addressData.totalAmount=totalAmount;
        const data = await dispatch(placeOrderThunk(addressData)).unwrap();
        if(data.status==200)
            setMsg(data.message);
        else
            setMsg("Something Went wrong");            
        event.target.reset();
    }
    const removeItem = async (cartid)=>{
        const msg = await dispatch(removeItemThunk(cartid)).unwrap();
        setMsg(msg);
    }
    return (<div>      
        <div className='row p-5'>
            <blockquote>
                <h5>Mobilekart | <span className='text-danger'>Cart</span> | {loggedEmail}</h5>
                <center><h5>MyCart List</h5></center>
                {msg}
                {
                    cartArray.length==0 ? <div>No Record Found</div> : (
                        <table className='table table-bordered'>
                            <tr>
                                <th>CartId</th>
                                <th>UserId</th>
                                <th>VariantId</th>
                                <th>Quantity</th>
                                <th>Price<br/>(Per Unit)</th>
                                <th>Brand</th>
                                <th>ModelName</th>
                                <th>Action</th>
                            </tr>
                            {
                                cartArray.map((cart)=>{
                                    return (<tr>
                                        <td>{cart.cartid}</td>
                                        <td>{cart.userid}</td>
                                        <td>{cart.variantid}</td>
                                        <td>{cart.quantity}</td>
                                        <td>{cart.price}</td>
                                        <td>{cart.brand}</td>
                                        <td>{cart.modelName}</td>
                                        <td>
                                            <button onClick={()=>{removeItem(cart.cartid)}} className='btn btn-danger'>Remove</button>
                                        </td>
                                    </tr>)
                                })
                            }
                        </table>
                    )
                }
                <hr/>
                <h6>Fill Details</h6>
                <form onSubmit={handleSubmit}>
                    <input
                        type="text"
                        placeholder='Enter Address'
                        id='address'
                        name='address'
                        required
                        onChange={getData}
                        className='ms-4 me-5 w-25'
                    />
                    <input
                        type="text"
                        placeholder='Enter State'
                        id='state'
                        name='state'
                        required
                        className='me-5 w-25'
                        onChange={getData}
                    />
                    <input
                        type="text"
                        placeholder='Enter City'
                        id='city'
                        name='city'
                        required
                        className='me-5'
                        onChange={getData}
                    />
                    <input
                        type="text"
                        placeholder='Enter Pincode'
                        id='pincode'
                        name='pincode'
                        required
                        onChange={getData}
                    /> <br/>
                <hr/>
                    <button className='btn btn-danger w-100'> Place Order to Buy | Bill Amount &#8377; {totalAmount} </button>
                </form>
                
            </blockquote>
        </div>  
    </div>);
}
export default UserViewCart;