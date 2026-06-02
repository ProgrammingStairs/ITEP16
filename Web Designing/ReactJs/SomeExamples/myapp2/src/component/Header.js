import { useSelector } from "react-redux";

function Header(){
    const userObj = useSelector(state=> state.user);
    return (<>
            <center>
                <h2>Example of Redux Toolkit</h2>
                <h3>Tagline | Count : {userObj.count}</h3>
                <hr/>
            </center>
    </>);
}
export default Header;