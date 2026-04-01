import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  const[txt,setTxt] = useState('');
  return (<>
    <input
      placeholder='Enter Text'
      name="txt"
      id="txt"
      onChange={(event)=>{
        setTxt(event.target.value);
      }}
    /> <br/>
    {txt}
  </>);
}

export default App;
