import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  const[userObj,setUserObj] = useState({});
  const[userArr,setUserArr] = useState([]);
  const getData = (event)=>{
    const {name,value} = event.target;
    setUserObj({
      ...userObj,
      [name]:value
    });
  }
  const handleSubmit = (event)=>{
    event.preventDefault();
    setUserArr([
      ...userArr,
      userObj
    ]);
    event.target.reset();
  }
  return (<div>
    <div style={{width:"25%",float:"left"}}>
      <blockquote>
        <h2>Fill Details</h2>
        <form onSubmit={handleSubmit}>
          <input
            type='text'
            placeholder='Enter Username'
            name='username'
            id='username'
            onChange={getData}
          /> <br/>
          <input
            type='email'
            placeholder='Enter Email'
            name='email'
            id='email'
            onChange={getData}
          /> <br/>
          <input
            type='password'
            placeholder='Enter Password'
            name='password'
            id='password'
            onChange={getData}
          /> <br/>
          <input
            type='text'
            placeholder='Enter Address'
            name='address'
            id='address'
            onChange={getData}
          /> <br/>
          <input
            type='submit'
            value="Register"
          /> 
          <input
            type='reset'
            value="Reset"
          /> <br/>
          <br/>
        </form>
      </blockquote>
    </div>
    <div style={{width:"75%",float:"left"}}>
      {
        userArr.length==0 ? <div><center><h3>No Record Found</h3></center></div> : (
          <table style={{width:"100%"}} border={1} cellSpacing={0}>
            <caption><h2>User Record</h2></caption>
            <tr>
              <th>S.No</th>
              <th>Username</th>
              <th>Email</th>
              <th>Password</th>
              <th>Address</th>
            </tr>
            {
              userArr.map((user,index)=>{
                return(<tr>
                  <td>{index+1}</td>
                  <td>{user.username}</td>
                  <td>{user.email}</td>
                  <td>{user.password}</td>
                  <td>{user.address}</td>
                </tr>);
              })
            }
          </table>
        )
      }
    </div>
  </div>);
}

export default App;

