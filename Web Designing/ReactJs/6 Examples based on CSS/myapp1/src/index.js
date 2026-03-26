import React from 'react';
import {createRoot} from 'react-dom/client';
import './style.css';
import banner from './images/banner.jpg';
import user from './images/user.avif';
import logoNew from './images/new.jpg';
function MyComponent(){
    return(<>
        <div id="container">
            <div id="header">
                <img src={banner} id="bannerImg" alt="image"/>    
            </div>   
            <div id="section">
                <img src={user} id="userImg" alt="image"/>
            </div> 
            <div id="box">
                <div id="box1">
                    <div id="imgSection">
                        <img src={logoNew} id="imgSec" alt="logo"/>
                    </div>
                    <center>
                        <h2>Heading-1</h2>
                    </center>
                </div>
                <div id="box1">
                    <div id="imgSection">
                        <img src={logoNew} id="imgSec" alt="logo"/>
                    </div>
                    <center>
                        <h2>Heading-1</h2>
                    </center>
                </div>
                <div id="box1">
                    <div id="imgSection">
                        <img src={logoNew} id="imgSec" alt="logo"/>
                    </div>
                    <center>
                        <h2>Heading-1</h2>
                    </center>
                </div>
            </div>
        </div>    
    </>);
}
createRoot(document.getElementById("root")).render(<MyComponent/>);