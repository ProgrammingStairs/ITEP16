import { useDispatch, useSelector } from 'react-redux';
import '../style.css';
import { reset } from '../store/userSlice.js';
function LeftSection(){
    const userObj = useSelector(state=> state.user)
    const dispatch = useDispatch();
    return (<div id="left">
        <h2>Counter : {userObj.count}</h2>
        <button onClick={()=>{dispatch(reset())}}>Reset</button>
    </div>);
}
export default LeftSection;