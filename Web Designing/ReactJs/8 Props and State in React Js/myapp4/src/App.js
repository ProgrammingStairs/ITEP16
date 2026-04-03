import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Display from './Display.js';
import React from 'react';

class App extends React.Component{
  state={
    userObj:{},
    userArr:[],
    index:-1
  }
  getData = (event)=>{
    const {name,value} = event.target;
    this.setState({
      userObj:{
        ...this.state.userObj,
        [name]:value  
      }
    });
  }
  handleSubmit = (event)=>{
    event.preventDefault();
    if(this.state.index==-1){
      this.setState({
        userArr:[
          ...this.state.userArr,
          this.state.userObj
        ]
      });
    }else{
      this.state.userArr.splice(this.state.index,1,this.state.userObj);
      this.setState({
        userArr:[...this.state.userArr]
      });
      this.setState({
        index : -1
      });
    }
    this.setState({
      userObj : {
        username:"",
        email:"",
        password:"",
        address:""
      } 
    });
    event.target.reset();
  }

  updateData = (obj)=>{
    this.setState({
      userObj : obj.user
    });
    this.setState({
      index : obj.index
    });
  }
  deleteData = (index)=>{
    this.state.userArr.splice(index,1);
    this.setState({
      userArr : [
        ...this.state.userArr
      ]
    });
  }
  render(){
      return (<div>
    <div style={{width:"25%",float:"left"}}>
      <blockquote>
        <h2>Fill Details</h2>
        <form onSubmit={this.handleSubmit}>
          <input
            type='text'
            placeholder='Enter Username'
            name='username'
            id='username'
            onChange={this.getData}
            value={this.state.userObj.username}
          /> <br/>
          <input
            type='email'
            placeholder='Enter Email'
            name='email'
            id='email'
            onChange={this.getData}
            value={this.state.userObj.email}
          /> <br/>
          <input
            type='password'
            placeholder='Enter Password'
            name='password'
            id='password'
            onChange={this.getData}
            value={this.state.userObj.password}
          /> <br/>
          <input
            type='text'
            placeholder='Enter Address'
            name='address'
            id='address'
            onChange={this.getData}
            value={this.state.userObj.address}
          /> <br/>
          <input
            type='submit'
            value={this.state.index==-1 ? "Register" : "Update"}
          /> 
          <input
            type='reset'
            value="Reset"
          /> <br/>
          <br/>
        </form>
      </blockquote>
    </div>
    <div style={{width:"75%",float:"left"}}>
      <Display data={this.state.userArr} delete={this.deleteData} update={this.updateData}/>    
    </div>
  </div>);
  }
}

export default App;



