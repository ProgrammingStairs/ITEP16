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
  return(<>
    <h3>Count : {count}</h3>
    <button onClick={()=>{setCount(count+1)}}>Click to Increment</button>
    <button onClick={()=>{setFname("Peter")}}>Click to change name</button>
    
    <h3>Memoized Component</h3>
    <Memoized name={fname} age={age}/>

    <h3>UnMemoized Component</h3>
    <UnMemoized name={fname} age={age}/>
  </>);
}

export default App;
/*
In React, useMemo is not a mandatory component to use with Memo. While Memo is a higher-order component that prevents unnecessary re-renders based on props, useMemo is a React Hook that caches the result of expensive computations. You can use both together, but you are not required to use Memo with useMemo. For example, you can wrap a component with Memo and then use useMemo within that component to optimize performance for specific calculations.
*/