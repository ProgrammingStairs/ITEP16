import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  const[count,setCount] = useState(0);
  const[title,setTitle] = useState('Count');
  const increment = function(){
    setCount(count+1);
  }
  var decrement = ()=>{
    setCount(count-1);
  }
  function changeTitle(){
    setTitle("Counting");
  }
  return (<>
      {title} : {count} <br/>
      <button onClick={increment}>Increment</button>
      <button onClick={()=>{
        decrement()
      }}>Decrement</button>
      <button onClick={()=>{setCount(0)}}>Reset</button>
      <button onClick={changeTitle}>ChangeTitle</button>

  </>);
}

export default App;
