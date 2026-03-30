import logo from './logo.svg';
import './App.css';
import React from 'react';

function MyFunComponent(){
  return(<blockquote>
    <h2 style={{color:"olive"}}>Functional Component</h2>
    <p>This is an exampel of create-react-app</p>
  </blockquote>);
}
class MyClassComponent extends React.Component{
  render(){
      return(<blockquote>
        <h2 style={{color:"orange"}}>Class Component</h2>
        <p>This is an exampel of create-react-app</p>
      </blockquote>);
  }
}

function App() {
  return (<blockquote>
    <h2 style={{color:"red"}}>Create-React-App</h2>
    <p>This is an exampel of create-react-app</p>
    <MyFunComponent/>
    <MyClassComponent/>
  </blockquote>);
}

export default App;
