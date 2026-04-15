// example showing the concept of useReducer hook
import logo from './logo.svg';
import './App.css';
import { useReducer} from 'react';

const initialState = {
  count:0
};
const reducer = (state,action)=>{
  switch(action.type){
    case 'increment' : return {...state,count:state.count+action.value};
    case 'decrement' : return {...state,count:state.count-action.value}; 
    case 'reset' : return {...state,count:action.value};
    default : return state;
  }
}
function App() {
  const [counter,dispatch] = useReducer(reducer,initialState);
  return(<>
    <h2>Count : {counter.count}</h2>
    <button onClick={()=>{dispatch({type:'increment',value:1})}}>Increment</button>
    <button onClick={()=>{dispatch({type:'decrement',value:1})}}>Decrement</button>
    <button onClick={()=>{dispatch({type:'reset',value:0})}}>Reset</button>
  </>);
}

export default App;
