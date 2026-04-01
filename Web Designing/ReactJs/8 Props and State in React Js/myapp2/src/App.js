import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  const[obj,setObj] = useState({});
  const[status,setStatus] = useState(false);
  const getData = (event)=>{
    const {name,value} = event.target;
    setObj({
      ...obj,
      [name]:value
    });
  }
  const handleSubmit = (event)=>{
    event.preventDefault();
    setStatus(true);
    event.target.reset();  
  }
  return (<>
  <form onSubmit={handleSubmit}>
    <input
      placeholder='Enter Username'
      name="username"
      id="username"
      type="text"
      onChange={getData}
    /> <br/>
    <input
      placeholder='Enter Email'
      name="email"
      id="email"
      type="email"
      onChange={getData}
    /> <br/>
    <input
      placeholder='Enter Password'
      name="password"
      id="password"
      type="password"
      onChange={getData}
    /> <br/>
    <input
      placeholder='Enter Address'
      name="address"
      id="address"
      type="text"
      onChange={getData}
    /> <br/>
    <button>Click</button>
    </form>
    <br/>
     { 
        status ? 
          (<div>
            Username : {obj.username} <br/>
            Email : {obj.email}<br/> 
            Password : {obj.password} <br/>
            Address : {obj.address}
          </div>) : ``
      } <br/>
  </>);
}

export default App;
