import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';

function App() {
  const [count,setCount] = useState(0);
  useEffect(()=>{
    const timer = setInterval(()=>{
        setCount(count+1);
    },1000);
    return ()=> clearInterval(timer);
  },[count]);
  return (<>
    Counting : {count}
  </>);
}

export default App;
