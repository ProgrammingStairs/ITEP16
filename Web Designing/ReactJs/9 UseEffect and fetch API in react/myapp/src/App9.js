import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';

function App() {
  var [count,setCount] = useState(0);
  var myFun = function(){
    console.log("function executes");
  }

  useEffect(()=>{
    setCount(count+1);
    myFun();
  },[myFun]);

  return (<>
    Count : {count}
  </>);
}

export default App;

