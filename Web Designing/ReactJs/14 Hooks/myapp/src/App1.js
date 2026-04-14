// Example showing the concept of Prop drilling
import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  const [fname,setFname] = useState("Andrew");
  const [lname,setLname] = useState("Anderson");
  return (<>
    <A fname={fname} lname={lname}/>
  </>);
}
function A(props){
  return (<>
    <B fname={props.fname} lname={props.lname}/>
  </>);
}
function B(props){
  return (<>
      <C fname={props.fname} lname={props.lname}/>
  </>);
}
function C(props){
  return (<>
    <h2>First Name : {props.fname}</h2>
    <h2>Last Name : {props.lname}</h2>
  </>);
}

export default App;
