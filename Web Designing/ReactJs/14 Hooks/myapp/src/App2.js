// Example showing the concept of ContextAPI solution of Prop drilling
import logo from './logo.svg';
import './App.css';
import { createContext, useContext, useState } from 'react';
const context = createContext(null);
function App() {
  const [fname,setFname] = useState("Peter");
  const [lname,setLname] = useState("Anderson");
  return (<context.Provider value={{fname,lname}}>
    <A/>
  </context.Provider>);
}
function A(){
  return (<>
    <B/>
  </>);
}
function B(){
  return (<>
      <C/>
  </>);
}
function C(){
  const {fname,lname} = useContext(context);
  return (<>
    <h2>First Name : {fname}</h2>
    <h2>Last Name : {lname}</h2>
  </>);
}

export default App;
