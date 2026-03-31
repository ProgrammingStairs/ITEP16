import logo from './logo.svg';
import './App.css';
import React from 'react';

class App extends React.Component{
  state={
    count : 0,
    title : "Counting"
  }
  changeTitle=function(){
    this.setState({title:"Count"});
  }
  decrement = ()=>{
        this.setState({count:this.state.count-1});
      }
  reset = ()=>{
    this.setState({count:0});
  }
  render(){
    return (<>
      {this.state.title} : {this.state.count} <br/>
      <button onClick={()=>{this.changeTitle()}}>Change Title</button>
      <button onClick={()=>{
        this.setState({count:this.state.count+1});
      }}>Increment</button>
      <button onClick={this.decrement}>Decrement</button>
      <button onClick={this.reset}>Reset</button>
      
    </>);
  }
}

export default App;
