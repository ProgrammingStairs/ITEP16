import React from 'react';
import {createRoot} from 'react-dom/client';

// createRoot(document.getElementById("root")).render("This is an example of React Js");

// var content = "This is an example of React Js..";
// var rootElement = document.getElementById("root");
// createRoot(rootElement).render(content);

// jsx
var content = <blockquote>
    <h3>Welcome to React Js</h3>
    <p>This is an example of React js</p>
</blockquote>;
var rootElement = document.getElementById("root");
createRoot(rootElement).render(content);