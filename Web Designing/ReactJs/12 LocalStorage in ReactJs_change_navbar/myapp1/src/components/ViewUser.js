import { useEffect, useState } from "react";
import { useLocation } from "react-router-dom";

function ViewUser() {
    const location = useLocation();
    const [userArray,setUserArray] = useState([]);
    useEffect(() => {
        localStorage.setItem("navShow", "profile");
        var existingData = JSON.parse(localStorage.getItem("data"));
        setUserArray([...existingData]);
    }, []); 

    return (<blockquote>
        <h3>Welcome {location.state?.email ? location.state.email : localStorage.getItem("loggedInEmail")}</h3>
        {userArray.length==0 ? <div>No Record Found</div>:(<table border={1} cellSpacing={0} cellPadding={5}>
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
                             <td>Update</td>
                             <td>Delete</td>
                            </tr>)
                })
            }
        </table>)}
    </blockquote>);
}
export default ViewUser;