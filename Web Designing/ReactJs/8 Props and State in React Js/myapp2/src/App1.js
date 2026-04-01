import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  const[name,setName] = useState('Andrew Anderson');
  const[age,setAge] = useState(67);
  return (<>
      Name : {name} <br/>
      Age : {age} <br/>
  </>);
}

export default App;
