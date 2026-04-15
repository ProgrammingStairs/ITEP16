// example showing the concept of useCallback
import logo from './logo.svg';
import './App.css';
import { useCallback, useState } from 'react';

function App() {
  const [num1,setNum1] = useState();
  const [num2,setNum2] = useState();
  const [result,setResult] = useState();
  const res = useCallback(()=>{
    setResult(parseInt(num1)+parseInt(num2));
  },[num1,num2]);
  return(<>
    <input
      type="text"
      placeholder='Enter First Number'
      name="num1"
      id="num1"
      onChange={(event)=>{setNum1(event.target.value);}}
    /> <br/>

    <input
      type="text"
      placeholder='Enter Second Number'
      name="num2"
      id="num2"
      onChange={(event)=>{setNum2(event.target.value);}}
    /> <br/>

    <input
      type="submit"
      value="Result"
      onClick={res}
    /> <br/>
    <span>Result : {result}</span>
  </>);
}

export default App;
