import { useSelector } from "react-redux";

function RightSection(){
    const userObj = useSelector(state=> state.user);
    return (<div style={{float:"left",width:"75%",height:"250px"}}>
        <blockquote>
            <h2>Count : {userObj.count}</h2>
            <form>
                <input
                    type="text"
                    placeholder="Enter TagLine"
                    id="tagline"
                    name="tagline"
                    required
                /><br/>
                <button>SetTagline</button>
            </form>
            <hr/>
            <button>Increment</button>
            <button>Decrement</button>
            <button>Reset</button>
            <hr/>
        </blockquote>
    </div>);
}
export default RightSection;