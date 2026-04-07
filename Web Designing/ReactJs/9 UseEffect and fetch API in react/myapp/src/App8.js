import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';

function App() {
  var myFun = function(){
    console.log("function executes");
  }
  // useEffect(()=>{
  //   myFun();
  // });

  useEffect(()=>{
    myFun();
  },[myFun]);

  return (<>
  </>);
}

export default App;
