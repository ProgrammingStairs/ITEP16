import React from 'react';
import {createRoot} from 'react-dom/client';

function Header(){
    return(<>
        <h2>Header Section</h2>
        <p>This is Header Section</p>
    </>);
}
function Navbar(){
    return(<>
        <h2>Navbar Section</h2>
        <p>This is Navbar Section</p>
    </>);
}
function About(){
    return(<>
        <h2>About Section</h2>
        <p>This is About Section</p>
    </>);
}
function Contact(){
    return(<>
        <h2>Contact Section</h2>
        <p>This is Contact Section</p>
    </>);
}
function Footer(){
    return(<>
        <h2>Footer Section</h2>
        <p>This is Footer Section</p>
    </>);
}

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