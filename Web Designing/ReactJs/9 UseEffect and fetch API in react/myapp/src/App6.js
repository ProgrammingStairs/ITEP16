import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';

function App() {
  const [count,setCount] = useState(0);
  const [countNew,setCountNew] = useState(0);
  
  useEffect(()=>{
    var timer;
    if(count<10){
      timer = setInterval(()=>{
          setCount(count+1);
      },1000);
      return ()=> clearInterval(timer);
    }else{
      clearInterval(timer);
    }  
  },[countNew]);
  return (<>
    Counting : {count}
  </>);
}

export default App;
