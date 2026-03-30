import logo from './logo.svg';
import './App.css';
import React from 'react';

function MyFunComponent(props){
  return (<>
    Name : {props.name} <br/>
    Age : {props.age} <br/>
    Address : {props.address} <br/>
  </>);
}
class MyClassComponent extends React.Component{
  render(){
    return(<>
      <br/>Name : {this.props.name} <br/>
      Age : {this.props.age} <br/>
      Address : {this.props.address} <br/>
    </>);
  }
}
function App() {
  return (<>
    <MyFunComponent name="Andrew Anderson" age={56} address="Indore, Madhya pradesh" />
    <MyClassComponent name="Peter Parker" age={32} address="Bhopal, Madhya Pradesh"/>
  </>);
}

export default App;
