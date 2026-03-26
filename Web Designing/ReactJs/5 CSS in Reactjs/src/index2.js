import React from 'react';
import {createRoot} from 'react-dom/client';
import './style.css';

function MyComponent(){
    return(<div id='demo1'>
        <h2 className='demo2'>Welcome to Css in React Js</h2>
        <p className='demo3'>This is an example of css in react js</p>
    </div>);
}

createRoot(document.getElementById("root")).render(<MyComponent/>);