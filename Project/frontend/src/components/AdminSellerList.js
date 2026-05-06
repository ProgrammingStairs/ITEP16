import banner from '../public/images/banner.png';
import '../public/css/style.css';
import { useDispatch, useSelector } from 'react-redux';
import { useEffect, useState } from 'react';
import { setNavShow } from '../store/commonSlice.js';
import { adminSellerListThunk,adminVerifySellerThunk } from '../store/adminSlice.js';
function AdminSellerList() {
    var email = useSelector(state=> state.login.loggedInEmail);
    var sellerList = useSelector(state=> state.admin.sellerList);
    console.log("======================= ",sellerList);
    
    const [loggedEmail,setLoggedEmail] = useState();
    const dispatch = useDispatch();
    useEffect(()=>{
        if(email){
            localStorage.setItem("email",email);
            setLoggedEmail(email);
        }else{
            var emailReceived = localStorage.getItem("email");
            setLoggedEmail(emailReceived);
        }
        dispatch(setNavShow("admin"));
        dispatch(adminSellerListThunk());
    },[email]);
    const verify = async(seller)=>{
        // alert(seller.sellerid);
        await dispatch(adminVerifySellerThunk(seller));
        dispatch(adminSellerListThunk());
    }
    return (<div>      
        <div className='row p-5'>
            <blockquote>
                <h5>Mobilekart | <span className='text-primary'>Seller List</span> | {loggedEmail}</h5>
                {sellerList.length==0 ? <div>No Record Found</div> : (<table border={1} cellPadding={5} cellSpacing={0} className='table table-bordered'>
                    <tr>
                        <th>SellerId</th>
                        <th>ShopName</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>GSTNo</th>
                        <th>PANNo</th>
                        <th>Address</th>
                        <th>AccountNo</th>
                        <th>EmailVerify</th>
                        <th>AdminVerify</th>
                    </tr>
{                        console.log("-----------------",sellerList)}
                    {
                        
                        sellerList.map((seller)=>{
                            return(<tr>
                                <td>{seller.sellerid}</td>
                                <td>{seller.shopname}</td>
                                <td>{seller.email}</td>
                                <td>{seller.contact}</td>
                                <td>{seller.gstno}</td>
                                <td>{seller.panno}</td>
                                <td>{seller.address}</td>
                                <td>{seller.accountno}</td>
                                <td>{seller.emailverify}</td>
                                <td>{seller.adminverify=="Verified" ? "Verified" : (<button onClick={()=>{verify(seller)}} className='btn btn-danger'>ClickToVerify</button>)}</td>
                            </tr>);
                        })
                    }
                </table>)}
            </blockquote>
        </div>  
    </div>);
}
export default AdminSellerList;