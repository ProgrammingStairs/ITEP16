import logo from './logo.svg';
import './App.css';
import { useReducer } from 'react';

const initialState = {
  counter : 0
};
const reducer = (state,action)=>{
  switch(action.type){
    case 'increment' : return {...state,counter:state.counter+action.payload};
    case 'decrement' : return {...state,counter:state.counter-action.payload};
    case 'reset' : return {...state,counter:0};
    default : return state;
  }
}
function App() {
  const [count,dispatch] = useReducer(reducer,initialState);
  return (<>
    <h2>Count : {count.counter}</h2>
    <button onClick={()=>{dispatch({type:'increment',payload:1})}}>Increment</button>
    <button onClick={()=>{dispatch({type:'decrement',payload:1})}}>Decrement</button>
    <button onClick={()=>{dispatch({type:'reset',payload:0})}}>Reset</button>
  </>);
}

export default App;


/*
initialState = {
  counter : 0
}
return {counter:state.counter+action.payload}
return {...state,counter:state.counter+action.payload} // recommended

initialState = {
  counter : 0,
  tagLine : "Default"
}
return {...state,counter:state.counter+action.payload}
*/