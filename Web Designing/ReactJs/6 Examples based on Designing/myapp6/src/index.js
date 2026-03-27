import React from 'react';
import {createRoot} from 'react-dom/client';
import './css/style.css';
import Navbar from './components/Navbar.js';
import Dashboard from './components/Dashboard.js';
import TitanicPie from './components/ChartDemo.js';
function MyComponent(){
    return(<div id="container">
        <Navbar/> <br/>
        <TitanicPie/>
        <Dashboard/>
    </div>);
}
createRoot(document.getElementById("root")).render(<MyComponent/>);