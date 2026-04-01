import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  const[name,setName] = useState('Andrew Anderson');
  const[age,setAge] = useState(56);
  var changeName = function(){
    setName("Mathew Math");
  }
  return (<>
      Name : {name} <br/>
      Age : {age} <br/>
      <button onClick={changeName}>ChangeName</button>
  </>);
}

export default App;
