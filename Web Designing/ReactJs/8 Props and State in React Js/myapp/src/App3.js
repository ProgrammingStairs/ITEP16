import logo from './logo.svg';
import './App.css';
import React from 'react';

function MyFunComponent({name="noname",age=0,address="Nill"}){
  return (<>
    Name : {name} <br/>
    Age : {age} <br/>
    Address : {address} <br/>
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
MyClassComponent.defaultProps={
  name:"noname",
  age:0,
  address:"Nill"
}
function App() {
  return (<>
    <MyFunComponent name="Andrew Anderson" address="Indore, Madhya pradesh" />
    <MyClassComponent name="Peter Parker" age={32} />
  </>);
}

export default App;
