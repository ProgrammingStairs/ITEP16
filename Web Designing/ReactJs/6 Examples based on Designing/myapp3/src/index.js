import React from 'react';
import {createRoot} from 'react-dom/client';
import './css/style.css';
import Banner from './components/BannerComponent/Banner.js';
import Content from './components/Content.js';
import Box from './components/Box.js';
import About from './components/About.js';
import Contact from './components/Contact.js';
import Footer from './components/Footer.js';
import Header from './components/HeaderComponent/Header.js';
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