import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { setNavShow } from "../store/commonSlice.js";
import { useSearchParams } from "react-router-dom";
import { sellerAddMobileVariantThunk } from "../store/sellerSlice.js";

function SellerAddVariant() {
    var email = useSelector(state => state.login.loggedInEmail);
    const [msg,setMsg] = useState();
    const [loggedEmail, setLoggedEmail] = useState();
    const dispatch = useDispatch();
    const [searchParam] = useSearchParams(); // destructuring
    const mobileId = searchParam.get("mobileId");
    const sellerId = searchParam.get("sellerId");
    // console.log("mobileId :", mobileId);
    // console.log("sellerId :", sellerId);
    const [mobileObj,setMobileObj] = useState({mobileid:mobileId,sellerid:sellerId});
    const getData = (event)=>{
        var {name,value} = event.target;
        if(event.target.type=="file"){
            value = event.target.files[0]
            setMobileObj({
                ...mobileObj,
                [name]:value
            });
        }else{
            setMobileObj({
                ...mobileObj,
                [name]:value
            });
        }
    }
    const handleSubmit = async(event)=>{
        event.preventDefault();
        const formData = new FormData();
        for(var key in mobileObj){
            if(mobileObj[key]){
                formData.append(key,mobileObj[key])
            }
        }
        const data = await dispatch(sellerAddMobileVariantThunk(formData)).unwrap();
        if(data.status==200)
            setMsg("Mobile Variant Added Successfully");
        else
            setMsg("Something went wrong");
        event.target.reset();
    }
    useEffect(() => {
        if (email) {
            localStorage.setItem("email", email);
            setLoggedEmail(email);
        } else {
            var emailReceived = localStorage.getItem("email");
            setLoggedEmail(emailReceived);
        }
        dispatch(setNavShow("seller"));
    }, [email]);

    return (<div className="row p-3">
        <h5>Mobilekart | <span className='text-primary'>Seller Home</span> | {loggedEmail}</h5>
        <br/>{msg}<br/>
        <h4>Add Variant</h4>
        <form className="form-control" onSubmit={handleSubmit} encType="multipart/form-data">
            <div class="row">
                <div className="col-lg-4" style={{ height: "auto" }}>
                    <div class="mb-3">
                        <label class="form-label">Price</label>
                        <input
                            type="text"
                            class="form-control"
                            name="price"
                            placeholder='Enter Price'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">Discounted Price</label>
                        <input
                            type="text"
                            class="form-control"
                            name="discountprice"
                            placeholder='Enter Discounted Price'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">Stock</label>
                        <input
                            type="number"
                            class="form-control"
                            name="stock"
                            placeholder='Enter Stock'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">SKU</label>
                        <input
                            type="text"
                            class="form-control"
                            name="sku"
                            placeholder='Enter SKU'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">Color</label>
                        <input
                            type="text"
                            class="form-control"
                            name="color"
                            placeholder='Enter Color'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">RAM</label>
                        <input
                            type="text"
                            class="form-control"
                            name="ram"
                            placeholder='Enter RAM'
                            onChange={getData}
                        /></div>
                </div>
                <div className="col-lg-4" style={{ height: "auto" }}>
                    <div class="mb-3">
                        <label class="form-label">Storage</label>
                        <input
                            type="text"
                            class="form-control"
                            name="storage"
                            placeholder='Enter Storage'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">Processor</label>
                        <input
                            type="text"
                            class="form-control"
                            name="processor"
                            placeholder='Enter Processor'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">DisplaySize</label>
                        <input
                            type="text"
                            class="form-control"
                            name="displaysize"
                            placeholder='Enter Display Size'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">Display Type</label>
                        <input
                            type="text"
                            class="form-control"
                            name="displaytype"
                            placeholder='Enter Display Type'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">Battery</label>
                        <input
                            type="text"
                            class="form-control"
                            name="battery"
                            placeholder='Enter Battery'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">Operating System</label>
                        <input
                            type="text"
                            class="form-control"
                            name="operatingsystem"
                            placeholder='Enter Operating System'
                            onChange={getData}
                        /></div>
                </div>
                <div className="col-lg-4" style={{ height: "auto" }}>
                    <div class="mb-3">
                        <label class="form-label">RearCamera</label>
                        <input
                            type="text"
                            class="form-control"
                            name="rearcamera"
                            placeholder='Enter Rear Camera'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">FrontCamera</label>
                        <input
                            type="text"
                            class="form-control"
                            name="frontcamera"
                            placeholder='Enter Front Camera'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">Network</label>
                        <input
                            type="text"
                            class="form-control"
                            name="network"
                            placeholder='Enter Network'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">SimType</label>
                        <input
                            type="text"
                            class="form-control"
                            name="simtype"
                            placeholder='Enter Sim Type'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">Weight</label>
                        <input
                            type="text"
                            class="form-control"
                            name="weight"
                            placeholder='Enter Weight'
                            onChange={getData}
                        /></div>
                    <div class="mb-3">
                        <label class="form-label">Upload</label>
                        <input
                            type="file"
                            class="form-control"
                            name="imagename"
                            onChange={getData}
                        /></div>
                </div>
            </div>
            <button type="submit" class="btn btn-dark w-100">Add Mobile</button>
        </form>
    </div>);
}
export default SellerAddVariant;