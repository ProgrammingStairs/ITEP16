import { useSelector } from 'react-redux';
import '../style.css';
function Header(){
    const userObj = useSelector(state=> state.user)
    return(<div id="header">
        <center>
            <h2>Example showing the concept of Redux-toolkit</h2>
            <h1>
                {userObj.tagLine} | Counter : {userObj.count}
            </h1>
        </center>
    </div>);
}
export default Header;