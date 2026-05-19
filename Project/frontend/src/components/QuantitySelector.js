import { useState } from "react";
import { useDispatch } from "react-redux";
import { addToCartThunk } from "../store/userSlice.js";

function QuantitySelector({variant,stock,price}){
    const [quantity,setQuantity] = useState(1);
    const [msg,setMsg] = useState();
    const dispatch = useDispatch();
    const increment = ()=>{
        if(quantity<stock)
            setQuantity(quantity+1);
    }
    const decrement = ()=>{
        if(quantity>1)
            setQuantity(quantity-1);
    }
    const handleSubmit = async ()=>{
        var obj = {
            variantid : variant,
            quantity : quantity,
            price : price
        }
        console.log("-----------------------> variant id : ",obj.variantid);
        
        const data = await dispatch(addToCartThunk(obj)).unwrap();
        if(data.status==200)
            setMsg("Mobile Added to Cart")
        else 
            setMsg("Something Went Wrong")
    }
    return(<>
        <button className="btn btn-success mb-1" onClick={increment}> + </button>
        &nbsp;&nbsp;&nbsp; {quantity} &nbsp;&nbsp;&nbsp;
        <button className="btn btn-danger mb-1" onClick={decrement}> <b>--</b> </button> <br/>
        <button className="btn btn-danger w-50" onClick={handleSubmit}>Add To Cart</button>
        <br/>
        <span style={{color:"red"}}>{msg}</span>
    </>)
}
export default QuantitySelector;