import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Display from './Display.js';
function App() {
  const[userObj,setUserObj] = useState({});
  const[userArr,setUserArr] = useState([]);
  const[index,setIndex] = useState(-1);
  const getData = (event)=>{
    const {name,value} = event.target;
    setUserObj({
      ...userObj,
      [name]:value
    });
  }
  const handleSubmit = (event)=>{
    event.preventDefault();
    if(index==-1){
      setUserArr([
        ...userArr,
        userObj
      ]);
    }else{
      userArr.splice(index,1,userObj);
      setUserArr([...userArr]);
      setIndex(-1);
    }
    setUserObj({
      username:"",
      email:"",
      password:"",
      address:""
    })
    event.target.reset();
  }
  const updateData = (obj)=>{
    setUserObj(obj.user);
    setIndex(obj.index);
  }
  const deleteData = (index)=>{
    userArr.splice(index,1);
    setUserArr([...userArr]);
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
            value={userObj.username}
          /> <br/>
          <input
            type='email'
            placeholder='Enter Email'
            name='email'
            id='email'
            onChange={getData}
            value={userObj.email}
          /> <br/>
          <input
            type='password'
            placeholder='Enter Password'
            name='password'
            id='password'
            onChange={getData}
            value={userObj.password}
          /> <br/>
          <input
            type='text'
            placeholder='Enter Address'
            name='address'
            id='address'
            onChange={getData}
            value={userObj.address}
          /> <br/>
          <input
            type='submit'
            value={index==-1 ? "Register" : "Update"}
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
      <Display data={userArr} delete={deleteData} update={updateData}/>    
    </div>
  </div>);
}

export default App;

