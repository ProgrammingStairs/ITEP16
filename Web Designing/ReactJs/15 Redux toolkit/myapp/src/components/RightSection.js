import { useDispatch, useSelector } from 'react-redux';
import { decrement, increment, reset, setTagLine } from '../store/userSlice.js';
import '../style.css';
import { useState } from 'react';
function RightSection(){
    const userObj = useSelector(state=>state.user);
    const [tagline,setTag] = useState(''); 
    const dispatch = useDispatch();
    const getData = (event)=>{
        setTag(event.target.value);
    }
    const handleSubmit = (event)=>{
        event.preventDefault();
        dispatch(setTagLine(tagline));
        event.target.reset();
    }
    return (<div id="right">
         
        <form onSubmit={handleSubmit}>
        <b>Enter TagLine : </b> 
        <input
            type="text"
            placeholder='Enter TagLine'
            id="tagline"
            name="tagline"
            required
            onChange={getData}
        /> 
        <button>Change TagLine</button> <br/><br/>
            
        </form>
        <button onClick={()=>{dispatch(increment())}}>Increment</button>
         <button onClick={()=>{dispatch(decrement())}}>Decrement</button>
          <button onClick={()=>{dispatch(reset())}}>Reset</button>
    </div>);
}
export default RightSection;