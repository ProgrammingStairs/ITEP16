function Display(props){
    return(<>
    {
        props.data.length==0 ? <div><center><h3>No Record Found</h3></center></div> : (
          <table style={{width:"100%"}} border={1} cellSpacing={0}>
            <caption><h2>User Record</h2></caption>
            <tr>
              <th>S.No</th>
              <th>Username</th>
              <th>Email</th>
              <th>Password</th>
              <th>Address</th>
              <th colspan={2}>Action</th>
            </tr>
            {
              props.data.map((user,index)=>{
                return(<tr>
                  <td>{index+1}</td>
                  <td>{user.username}</td>
                  <td>{user.email}</td>
                  <td>{user.password}</td>
                  <td>{user.address}</td>
                  <td><button onClick={()=>{props.update({user,index})}}>Update</button></td>
                  <td><button onClick={()=>{props.delete(index)}}>Delete</button></td>
                </tr>);
              })
            }
          </table>
        )
      }
    </>);
}
export default Display;