import React from 'react';
import {createRoot} from 'react-dom/client';
import './css/style.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.min.js';
import NavbarDemo from './components/NavbarDemo.js';
import Slider from './components/Slider.js';

function MyComponent(){
    return(<div id="container">
        <NavbarDemo/>
        <Slider/>
    </div>);
}
createRoot(document.getElementById("root")).render(<MyComponent/>);