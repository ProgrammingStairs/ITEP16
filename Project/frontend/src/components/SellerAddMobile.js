import { useDispatch, useSelector } from "react-redux";
import { setNavShow } from "../store/commonSlice";
import { useEffect, useState } from "react";
import { sellerAddMobileThunk, sellerMobileListThunk } from "../store/sellerSlice.js";
import { Link } from "react-router-dom";
function SellerAddMobile() {
    var email = useSelector(state=> state.login.loggedInEmail);
    var mobileList = useSelector(state=> state.seller.mobileList);
    const [loggedEmail,setLoggedEmail] = useState();
    const [mobileObj,setMobileObj] = useState({});
    const dispatch = useDispatch();
    const [msg,setMsg] = useState();
    useEffect(()=>{
        if(email){
            localStorage.setItem("email",email);
            setLoggedEmail(email);
        }else{
            var emailReceived = localStorage.getItem("email");
            setLoggedEmail(emailReceived);
        }
        dispatch(setNavShow("seller"));
        dispatch(sellerMobileListThunk());
    },[email]);
    const getData = (event)=>{
        const {name,value} = event.target;
        setMobileObj({
            ...mobileObj,
            [name]:value
        })
    }
    const handleSubmit = async(event)=>{
        event.preventDefault();
        var data = await dispatch(sellerAddMobileThunk(mobileObj)).unwrap();
        if(data.status==200){
            setMsg('Mobile Added Successfully');
            dispatch(sellerMobileListThunk());
        }
        event.target.reset();
    }
    return (<div className="row p-5">
        <h5>Mobilekart | <span className='text-primary'>Seller Home</span> | {loggedEmail}</h5>
        <div style={{color:"orangered"}}>  {msg} </div>
        <div className="col-lg-3" style={{height:"auto",padding:"5px"}}>
            <h4>Add Mobile</h4>
            <form className="form-control" onSubmit={handleSubmit}>
                    <div class="mb-3">
                        <label class="form-label">Brand</label>
                        <input
                            type="text"
                            class="form-control"
                            name="brand"
                            placeholder='Enter Brand'
                            onChange={getData}
                        />
                    </div>
                      <div class="mb-3">
                        <label class="form-label">Model Name</label>
                        <input
                            type="text"
                            class="form-control"
                            name="modelname"
                            placeholder='Enter Model Name'
                            onChange={getData}
                        />
                    </div>
                     <div class="mb-3">
                        <label class="form-label">Description</label>
                        <textarea
                            class="form-control"
                            name="description"
                            placeholder='Enter Description'
                            onChange={getData}
                        ></textarea>
                    </div>
                <button type="submit" class="btn btn-dark w-100">Add Mobile</button>
            </form>
        </div>
        <div className="col-lg-9" style={{height:"auto"}}>
             <h4>Mobile List</h4>
             {mobileList.length==0 ? <div>No Record Found</div> : (<table border={1} cellSpacing={0} cellPadding={1} className="table table-bordered">
                <tr>
                    <th>MobileId</th>
                    <th>SellerId</th>
                    <th>Brand</th>
                    <th>Model</th>
                    <th>Description</th>
                    <th>Action</th>
                </tr>
                {
                    mobileList.map((mobile)=>{
                        return (<tr>
                            <td>{mobile.mobileid}</td>
                            <td>{mobile.sellerid}</td>
                            <td>{mobile.brand}</td>
                            <td>{mobile.modelname}</td>
                            <td>{mobile.description}</td>
                            <td>
                                <Link to={`/seller/sellerAddVariant?mobileId=${mobile.mobileid}&sellerId=${mobile.sellerid}`} className="btn btn-success">Add Variant</Link>
                            </td>
                        </tr>)
                    })
                }
             </table>)}
        </div>

    </div>);
}
export default SellerAddMobile;