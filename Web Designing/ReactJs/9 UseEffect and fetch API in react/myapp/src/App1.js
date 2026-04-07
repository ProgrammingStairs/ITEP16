import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';

function App() {
  const [count,setCount] = useState(0);
  useEffect(()=>{
    setCount(count+1);
  });
  return (<>
    Counting : {count}
  </>);
}

export default App;
