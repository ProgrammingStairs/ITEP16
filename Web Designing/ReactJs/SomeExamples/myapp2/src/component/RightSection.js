import { useDispatch, useSelector } from "react-redux";
import { increment,decrement,reset, setTagLine } from "../store/userSlice.js";
import { useState } from "react";
function RightSection(){
    const userObj = useSelector(state=> state.user);
    const dispatch = useDispatch();
    const [tagline,setTag] = useState();
    const getData = (event)=>{
        setTag(event.target.value);
    }
    const handleSubmit = (event)=>{
        event.preventDefault();
        dispatch(setTagLine(tagline));
        event.target.reset();
    }
    return (<div style={{float:"left",width:"75%",height:"250px"}}>
        <blockquote>
            <h2>Count : {userObj.count}</h2>
            <form onSubmit={handleSubmit}>
                <input
                    type="text"
                    placeholder="Enter TagLine"
                    id="tagline"
                    name="tagline"
                    required
                    onChange={getData}
                /><br/>
                <button>SetTagline</button>
            </form>
            <hr/>
            <button onClick={()=>{dispatch(increment())}}>Increment</button>
            <button onClick={()=>{dispatch(decrement())}}>Decrement</button>
            <button onClick={()=>{dispatch(reset())}}>Reset</button>
            <hr/>
        </blockquote>
    </div>);
}
export default RightSection;