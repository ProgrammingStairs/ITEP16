import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  const[txt,setTxt] = useState('');
  const[status,setStatus] = useState(false);
  return (<>
    <input
      placeholder='Enter Text'
      name="txt"
      id="txt"
      onChange={(event)=>{
        setTxt(event.target.value);
      }}
    /> 
    <button onClick={()=>{setStatus(true);}}>Click</button>
    <br/>
    {status ? txt : ''}
  </>);
}

export default App;
