import logo from './logo.svg';
import './App.css';
import React from 'react';

class App extends React.Component{
  state={
    name:"Andrew Anderson",
    age:56
  }
  render(){
    console.log(this);
    return (<>
      Name : {this.state.name} <br/>
      Age : {this.state.age} <br/>
      
    </>);
  }
}

export default App;
