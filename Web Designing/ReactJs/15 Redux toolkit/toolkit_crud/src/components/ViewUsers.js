import { useDispatch, useSelector } from "react-redux";
import '../style.css';
import { deleteUser, updateUser } from "../store/userSlice.js";
import { useNavigate } from "react-router-dom";
function ViewUsers(){
    var userArray = useSelector(state=> state.user.userArray);
    const dispatch = useDispatch();
    const navigate = useNavigate();
    return (<>
        <blockquote>
            {userArray.length==0 ? <div>No Record Found</div> : (<table border={1} width={"80%"} cellSpacing={0} cellPadding={8}>
                <caption><h2>User List</h2></caption>
                <tr>
                    <th>S.No</th>
                    <th>Username</th>    
                    <th>Email</th>    
                    <th>Password</th>    
                    <th>Address</th>
                    <th colspan={2}>Action</th>        
                </tr>   
                {
                    userArray.map((user,index)=>{
                        return(<tr>
                            <td>{index+1}</td>
                            <td>{user.username}</td>
                            <td>{user.email}</td>
                            <td>{user.password}</td>
                            <td>{user.address}</td>
                            <td><button onClick={()=>{
                                dispatch(updateUser({user,index}));
                                navigate("/addUser");
                            }}>Update</button></td>                            
                            <td><button onClick={()=>{
                                dispatch(deleteUser(index));
                            }}>Delete</button></td>                            
                        </tr>);
                    })
                } 
            </table>)}    
        </blockquote>    
    </>);
}

export default ViewUsers;