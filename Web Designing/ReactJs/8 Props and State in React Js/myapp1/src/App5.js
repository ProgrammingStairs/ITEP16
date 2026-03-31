import logo from './logo.svg';
import './App.css';
import React from 'react';

class App extends React.Component{
  /*
  constructor(){
    super();
      this.state={
        name:"Andrew Anderson",
        age:89
      }
  this.changeName = this.changeName.bind(this);
  }
  changeName = function(){
    this.setState({name : "Mathew Math"});
  }
    */

    constructor(){
    super();
      this.state={
        name:"Andrew Anderson",
        age:89
      }
  }
  changeName = ()=>{
    this.setState({name : "Mathew Math"});
  }

  render(){
    console.log(this);
    return (<>
      Name : {this.state.name} <br/>
      Age : {this.state.age} <br/>  
      <button onClick={this.changeName}>Change name</button>    
    </>);
  }
}

export default App;
