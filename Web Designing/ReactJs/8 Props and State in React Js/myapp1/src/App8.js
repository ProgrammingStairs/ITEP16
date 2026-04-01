import logo from './logo.svg';
import './App.css';
import React from 'react';

class App extends React.Component{
  state={
    txt : '',
    status : false
  }
  show=()=>{
    this.setState({status:true});
  }
  render(){
    return (<>
      <input
        type="text"
        placeholder='Enter Text'
        name="txt"
        id='txt'
        onChange={(event)=>{
          this.setState({txt:event.target.value});
        }} 
      />
        <button onClick={this.show}>Click</button>
       <br/>
      {this.state.status ? this.state.txt : ''}
    </>);
  }
}

export default App;
