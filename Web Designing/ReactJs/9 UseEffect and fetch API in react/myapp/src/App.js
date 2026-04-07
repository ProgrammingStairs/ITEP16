import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';

var myFun = function(){
    console.log("function executes");
}

function App() {
  var [count,setCount] = useState(0);

  useEffect(()=>{
    setCount(count+1);
    myFun();
  },[myFun]);

  return (<>
    Count : {count}
  </>);
}

export default App;
