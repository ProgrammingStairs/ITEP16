import logo from './logo.svg';
import './App.css';
import React from 'react';

class App extends React.Component{
  state={
    txt : ''
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
      /> <br/>
      {this.state.txt}
    </>);
  }
}

export default App;
