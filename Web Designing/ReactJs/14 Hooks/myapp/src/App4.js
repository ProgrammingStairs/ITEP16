// example showing the concept of useMemo and memo
import logo from './logo.svg';
import './App.css';
import { memo, useMemo, useState } from 'react';

const Memoized = memo((props)=>{
  console.log(`Memoized : Hello ${props.name} your age is ${props.age}`);
  return (<>
    <div>Hello {props.name} your age is {props.age}</div>  
  </>);
})

function UnMemoized(props){
  console.log(`UnMemoized : Hello ${props.name} your age is ${props.age}`);
  return (<>
    <div>Hello {props.name} your age is {props.age}</div>  
  </>);
}
function App() {
  const [fname,setFname] = useState("Andrew");
  const [age,setAge] = useState(50);
  const [count,setCount] = useState(0);
  const memoized = useMemo(()=> <Memoized name={fname} age={age}/>,[fname,age]);
  return(<>
    <h3>Count : {count}</h3>
    <button onClick={()=>{setCount(count+1)}}>Click to Increment</button>
    <button onClick={()=>{setFname("Peter")}}>Click to change name</button>
    
    <h3>Memoized Component</h3>
    {memoized}

    <h3>UnMemoized Component</h3>
    <UnMemoized name={fname} age={age}/>
  </>);
}

export default App;
