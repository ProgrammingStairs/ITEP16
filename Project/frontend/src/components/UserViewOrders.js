import banner from '../public/images/banner.png';
import '../public/css/style.css';
import { useDispatch, useSelector } from 'react-redux';
import { useEffect, useState } from 'react';
import { setNavShow } from '../store/commonSlice.js';
import { placeOrderListThunk } from '../store/userSlice.js';
function UserHome() {
    const placeOrderListArray = useSelector(state=> state.user.placeOrderListArray);
    const email = useSelector(state=> state.login.loggedInEmail);
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
        dispatch(placeOrderListThunk());
    },[email]);

    return (<div>      
        <div className='row p-5'>
            <blockquote>
                <h5>Mobilekart | <span className='text-primary'>Placed Orders</span> | {loggedEmail}</h5>
                {
                    placeOrderListArray.length==0 ? <div>No Record Found</div> : (
                    <table className='table table-bordered'>
                        <tr>
                            <th>OrderId</th>
                            <th>TotalAmount</th>
                            <th>OrderStatus</th>
                            <th>PaymentStatus</th>
                            <th>PaymentMethod</th>
                            <th>Address</th>
                            <th>Items</th>
                        </tr>
                        {
                            placeOrderListArray.map((order)=>{
                                return (<tr>
                                    <td>{order.orderid}</td>
                                    <td>{order.totalamount}</td>
                                    <td>{order.orderstatus}</td>
                                    <td>{order.paymentstatus}</td>
                                    <td>{order.paymentmethod}</td>
                                    <td>{order.address+" , "+order.city+" , "+order.state+" , "+order.pincode}</td>
                                    <td>
                                        <table className='table table-bordered'>
                                            <tr>
                                                <td>OrderItemId</td>
                                                <td>VariantId</td>
                                                <td>Quantity</td>
                                                <td>Price</td>
                                                <td>TotalPrice</td>                                                
                                            </tr>
                                            {
                                                order.orderitems.map((item)=>{
                                                    return(<tr>
                                                        <td>{item.orderitemsid}</td>
                                                        <td>{item.variantid}</td>
                                                        <td>{item.quantity}</td>
                                                        <td>{item.price}</td>
                                                        <td>{item.totalprice}</td>
                                                    </tr>)
                                                })
                                            }
                                        </table>
                                    </td>
                                </tr>)
                            })
                        }
                    </table>
                )
                }
            </blockquote>
        </div>  
    </div>);
}
export default UserHome;