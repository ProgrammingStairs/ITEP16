import logo from './logo.svg';
import './App.css';
import React from 'react';

class App extends React.Component{
  state={
    obj:{},
    status : false
  }
  getData = (event)=>{
    const {name,value} = event.target;
    this.setState({
      obj : {
        ...this.state.obj,
        [name] : value
      }
    });
  }
  handleSubmit=(event)=>{
    event.preventDefault();
    this.setState({status : true});
    event.target.reset();
  }
  render(){
    return (<>
    <form onSubmit={this.handleSubmit}>
      <input
        type="text"
        placeholder='Enter Text'
        name="username"
        id='username'
        onChange={this.getData} 
      /><br/>
      <input
        type="email"
        placeholder='Enter Email'
        name="email"
        id='email'
        onChange={this.getData} 
      />
      <br/>
      <input
        type="password"
        placeholder='Enter Password'
        name="password"
        id='password'
        onChange={this.getData} 
      /> <br/>
        <button>Click</button>
       <br/>
       </form>
      { 
        this.state.status == true ? 
          (<div>
            Username : {this.state.obj.username} <br/>
            Email : {this.state.obj.email}<br/> 
            Password : {this.state.obj.password}
          </div>) : ``
      } <br/>

    </>);
  }
}

export default App;
