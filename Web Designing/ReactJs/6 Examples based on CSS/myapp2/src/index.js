import React from 'react';
import {createRoot} from 'react-dom/client';
import './css/style.css';
import Header from './components/Header.js';
import Banner from './components/Banner.js';
function MyComponent(){
    return(<div id="container">
        <Header/>
        <Banner/>
    </div>);
}
createRoot(document.getElementById("root")).render(<MyComponent/>);