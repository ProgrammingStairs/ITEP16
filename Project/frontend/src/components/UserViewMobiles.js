import banner from '../public/images/banner.png';
import '../public/css/style.css';
import { useDispatch, useSelector } from 'react-redux';
import { useEffect, useState } from 'react';
import { setNavShow } from '../store/commonSlice.js';
import { userViewMobileListThunk } from '../store/userSlice.js';
import QuantitySelector from './QuantitySelector.js';
function UserViewMobiles() {
    var email = useSelector(state=> state.login.loggedInEmail);
    var mobileListWithVariant = useSelector(state=> state.user.mobileListWithVariant);
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
        dispatch(setNavShow("user"));
        dispatch(userViewMobileListThunk());
    },[email]);
    return (<div>      
        <div className='row p-5'>
            <blockquote>
                <h5>Mobilekart | <span className='text-primary'>Mobile List</span> | {loggedEmail}</h5>
                {mobileListWithVariant.length==0 ? <div>No Record Found</div> : (
                    mobileListWithVariant.map((mobile)=>{
                        return ( mobile.variants.map((variant)=>{
                            return (<div className='row' style={{margin:"30px"}}>
                                <div className='col-lg-3'>
                                    <img
                                        src={variant.imageurl}
                                        height="240px"
                                        width="200px"
                                        alt='mobile image'
                                    />
                                </div>
                                <div className='col-lg-9 row'>
                                    <div className='col-lg-4'>
                                        <b>Brand : </b> {mobile.brand} <br/>
                                        <b>ModelName : </b> {mobile.modelname} <br/>
                                        <b>Price : </b> &#8377; {variant.price} <br/>
                                        <b>DiscountPrice : </b> <span style={{color:"red",fontSize:"18px",fontWeight:"bolder"}}> &#8377; {variant.discountprice}</span> <br/>
                                        <b>Description : </b> {mobile.description} <br/>
                                        <b>RAM : </b> {variant.ram} <br/>
                                        <b>Storage : </b> {variant.storage} <br/>
                                        <b>Battery : </b> {variant.battery} <br/>
                                        <b>Weight : </b> {variant.weight} <br/>
                                    </div>
                                    <div className='col-lg-4'>
                                        <b>DisplaySize : </b> {variant.displaysize} <br/>
                                        <b>DisplayType : </b> {variant.displaytype} <br/>
                                        <b>RearCamera : </b> {variant.rearcamera} <br/>
                                        <b>FrontCamera : </b> {variant.frontcamera} <br/>
                                        <b>Network : </b> {variant.network} <br/>
                                        <b>OperatingSystem : </b> {variant.operatingsystem} <br/>
                                        <b>Processor : </b> {variant.processor} <br/>
                                        <b>Color : </b> {variant.color} <br/>
                                        <b>SimType : </b> {variant.simtype} <br/>
                                    </div>
                                    <div className='col-lg-4'>
                                        <b>SKU : </b> {variant.sku} <br/>
                                        <b>MobileId : </b> {mobile.mobileid} <br/>
                                        <b>SellerId : </b> {mobile.sellerid} <br/>
                                        <b>MobileVariantId : </b> {variant.mobilevariantid} <br/>
                                        <b>CreatedAt : </b> {mobile.createdat.split("T")[0]} <br/>
                                        <b>Stock : </b> <span style={{color:"red",fontSize:"18px",fontWeight:"bolder"}}> {variant.stock} </span> <br/>
                                        {variant.stock==0 ? <button className='btn btn-danger disabled'>Out Of Stock</button> :(<div>
                                            <QuantitySelector
                                                variant = {variant.mobilevariantid}
                                                stock = {variant.stock}
                                                price = {variant.discountprice}
                                            />
                                        </div>) }

                                    </div>
                                </div>
                            </div>)
                        }) )
                    })
                )}
            </blockquote>
        </div>  
    </div>);
}
export default UserViewMobiles;