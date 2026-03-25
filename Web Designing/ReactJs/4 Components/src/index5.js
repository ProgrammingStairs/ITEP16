import React from 'react';
import {createRoot} from 'react-dom/client';
import Footer, { About, Contact, Header, Navbar } from './test.jsx';

function MyComponent(){
    return(<>
        <Header/>
        <Navbar/>
        <About/>
        <Contact/>
        <Footer/>
    </>);
}
createRoot(document.getElementById("root")).render(<MyComponent></MyComponent>);