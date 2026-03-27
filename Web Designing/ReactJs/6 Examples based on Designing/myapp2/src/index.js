import React from 'react';
import {createRoot} from 'react-dom/client';
import './css/style.css';
import Header from './components/Header.js';
import Banner from './components/Banner.js';
import Content from './components/Content.js';
import Box from './components/Box.js';
import About from './components/About.js';
import Contact from './components/Contact.js';
import Footer from './components/Footer.js';
function MyComponent(){
    return(<div id="container">
        <Header/>
        <Banner/>
        <Content/>
        <Box/>
        <About/>
        <Contact/>
        <Footer/>
    </div>);
}
createRoot(document.getElementById("root")).render(<MyComponent/>);