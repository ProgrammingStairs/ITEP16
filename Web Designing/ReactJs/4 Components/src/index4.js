import React from 'react';
import {createRoot} from 'react-dom/client';
import Header from './components/Header.js';
import Navbar from './components/Navbar.js';
import About from './components/About.js';
import Contact from './components/Contact.js';
import Footer from './components/Footer.js';

class MyComponent extends React.Component{
    render(){
            return(<>
                <Header/>
                <Header/>
                <Header/>
                <Header/>

                <Navbar/>
                <About/>
                <Contact/>
                <Footer/>
            </>);
    }
}
createRoot(document.getElementById("root")).render(<MyComponent></MyComponent>);