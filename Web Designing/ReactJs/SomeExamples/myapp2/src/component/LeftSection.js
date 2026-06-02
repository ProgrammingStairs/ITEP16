import { useDispatch, useSelector } from "react-redux";
import { reset } from "../store/userSlice.js";
function LeftSection(){
    const userObj = useSelector(state=> state.user);
    const dispatch = useDispatch();
    return (<div style={{float:"left",width:"25%"}}>
        <blockquote>
            <h2>Count : {userObj.count}</h2>
            <button onClick={()=>{dispatch(reset())}}>Reset</button>
        </blockquote>
    </div>);
}
export default LeftSection;