import logo from './logo.svg';
import './App.css';
import React from 'react';

class App extends React.Component{
  state={
    username : '',
    email : '',
    password:'',
    obj:{}
  }
  show=()=>{
    this.setState({
      obj : {
        username : this.state.username,
        email : this.state.email,
        password :this.state.password
      }
    });
  }
  render(){
    return (<>
      <input
        type="text"
        placeholder='Enter Text'
        name="username"
        id='username'
        onChange={(event)=>{
          this.setState({username:event.target.value});
        }} 
      /><br/>
      <input
        type="email"
        placeholder='Enter Email'
        name="email"
        id='email'
        onChange={(event)=>{
          this.setState({email:event.target.value});
        }} 
      />
      <br/>
      <input
        type="password"
        placeholder='Enter Password'
        name="password"
        id='password'
        onChange={(event)=>{
          this.setState({password:event.target.value});
        }} 
      /> <br/>
        <button onClick={this.show}>Click</button>
       <br/>
      { this.state.obj.username ? `Username : ${this.state.obj.username}` : ``} <br/>
      { this.state.obj.email ? `Email : ${this.state.obj.email}` : ``} <br/>
      { this.state.obj.password ? `Password : ${this.state.obj.password}` : ``} <br/>

    </>);
  }
}

export default App;