// example showing the concept of useReducer hook
import logo from './logo.svg';
import './App.css';
import { useReducer} from 'react';

const initialState = 0;
const reducer = (state,action)=>{
  switch(action){
    case 'increment' : return state+=1;
    case 'decrement' : return state-=1; 
    case 'reset' : return state = 0;
    default : return state;
  }
}
function App() {
  const [count,dispatch] = useReducer(reducer,initialState);
  return(<>
    <h2>Count : {count}</h2>
    <button onClick={()=>{dispatch('increment')}}>Increment</button>
    <button onClick={()=>{dispatch('decrement')}}>Decrement</button>
    <button onClick={()=>{dispatch('reset')}}>Reset</button>

  </>);
}

export default App;
