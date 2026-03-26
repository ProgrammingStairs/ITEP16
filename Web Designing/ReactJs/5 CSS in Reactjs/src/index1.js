import React from 'react';
import {createRoot} from 'react-dom/client';

/*
function MyComponent(){
    return(<div style={{backgroundColor:"crimson",padding:"10px",fontSize:"30px"}}>
        <h2 style={{color:"white"}}>Welcome to Css in React Js</h2>
        <p style={{fontFamily:"cursive"}}>This is an example of css in react js</p>
    </div>);
}
*/

/*
function MyComponent(){
    const style1 = {
            backgroundColor:"green",
            padding:"10px",
            fontSize:"30px"
        }
    const style2 = {
            color:"orange"
        }    
    const style3 = {
            fontFamily:"cursive"
        }
    return(<div style={style1}>
        <h2 style={style2}>Welcome to Css in React Js</h2>
        <p style={style3}>This is an example of css in react js</p>
    </div>);
}
*/


function MyComponent(){
    const style = {
        style1 : {
            backgroundColor:"lightgreen",
            padding:"10px",
            fontSize:"30px"
        },
        style2 : {
            color:"darkgreen"
        },
        style3 : {
            fontFamily:"cursive"
        }
    }
    return(<div style={style.style1}>
        <h2 style={style.style2}>Welcome to Css in React Js</h2>
        <p style={style.style3}>This is an example of css in react js</p>
    </div>);
}


createRoot(document.getElementById("root")).render(<MyComponent/>);