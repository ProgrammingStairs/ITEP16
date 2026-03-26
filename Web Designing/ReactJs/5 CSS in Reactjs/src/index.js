import React from 'react';
import {createRoot} from 'react-dom/client';
import './style.css';
import styled from 'styled-components';

const MyContent = styled.div`
    background-color:red;
    color:white;
    font-family:monospace;
    padding:20px;
`
function MyComponent(){
    return(<MyContent>
        <h2>Welcome to Css in React Js</h2>
        <p>This is an example of css in react js</p>
    </MyContent>);
}

createRoot(document.getElementById("root")).render(<MyComponent/>);