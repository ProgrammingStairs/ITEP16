import logo from './logo.svg';
import './App.css';
import React from 'react';

function MyFunComponent(props){
  // {console.log(props);}
  return (<>
    Name : {props.name}
  </>);
}
class MyClassComponent extends React.Component{
  render(){
    console.log(this);
    return(<>
      <br/>Name : {this.props.name}
    </>);
  }
}
function App() {
  var name = "Peter Parker"
  return (<>
    {/* <MyFunComponent name="Andrew Anderson"/> */}
    <MyFunComponent name={name}/>
    <MyClassComponent name={name}/>
  </>);
}

export default App;
