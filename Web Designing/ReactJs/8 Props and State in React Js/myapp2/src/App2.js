import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App(props) {
  const[name,setName] = useState(props.name);
  const[age,setAge] = useState(props.age);
  return (<>
      Name : {name} <br/>
      Age : {age} <br/>
  </>);
}

function MyComponent(){
  return(<>
    <App name='Peter Parker' age={43}/>
  </>);
}
export default MyComponent;
