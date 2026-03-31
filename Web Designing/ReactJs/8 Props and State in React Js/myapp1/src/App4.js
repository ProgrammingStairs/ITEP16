import logo from './logo.svg';
import './App.css';
import React from 'react';

class App extends React.Component{
  constructor(props){
    super(props);
      this.state={
        name:this.props.name,
        age:this.props.age
      }
  }
  render(){
    console.log(this);
    return (<>
      Name : {this.state.name} <br/>
      Age : {this.state.age} <br/>
      
    </>);
  }
}

class MyComponent extends React.Component{
  render(){
    return(<>
      <App name="Peter Parker" age={90}/>
    </>);
  }
}
export default MyComponent;

