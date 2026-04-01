import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  const[username,setUsername] = useState('');
  const[email,setEmail] = useState('');
  const[password,setPassword] = useState('');
  const[address,setAddress] = useState('');
  const[obj,setObj] = useState({});
  
  const handleSubmit = (event)=>{
    setObj({
      username,
      email,
      password,
      address
    });  
  }
  return (<>
    <input
      placeholder='Enter Username'
      name="username"
      id="username"
      type="text"
      onChange={(event)=>{
        setUsername(event.target.value);
      }}
    /> <br/>
    <input
      placeholder='Enter Email'
      name="email"
      id="email"
      type="email"
      onChange={(event)=>{
        setEmail(event.target.value);
      }}
    /> <br/>
    <input
      placeholder='Enter Password'
      name="password"
      id="password"
      type="password"
      onChange={(event)=>{
        setPassword(event.target.value);
      }}
    /> <br/>
    <input
      placeholder='Enter Address'
      name="address"
      id="address"
      type="text"
      onChange={(event)=>{
        setAddress(event.target.value);
      }}
    /> <br/>
    <button onClick={handleSubmit}>Click</button>
    <br/>
    {obj.username ? obj.username : ''} <br/>
    {obj.email ? obj.email : ''} <br/>
    {obj.password ? obj.password : ''} <br/>
    {obj.address ? obj.address : ''} <br/>
  </>);
}

export default App;