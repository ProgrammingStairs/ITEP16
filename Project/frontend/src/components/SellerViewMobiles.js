import banner from '../public/images/banner.png';
import '../public/css/style.css';
import { useDispatch, useSelector } from 'react-redux';
import { useEffect, useState } from 'react';
import { setNavShow } from '../store/commonSlice.js';
import { sellerViewMobileListThunk } from '../store/sellerSlice.js';
function SellerViewMobiles() {
    var email = useSelector(state=> state.login.loggedInEmail);
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
        dispatch(setNavShow("seller"));
        dispatch(sellerViewMobileListThunk());
    },[email]);
    return (<div>      
        <div className='row p-5'>
            <blockquote>
                <h5>Mobilekart | <span className='text-primary'>Mobile List</span> | {loggedEmail}</h5>
                
            </blockquote>
        </div>  
    </div>);
}
export default SellerViewMobiles;