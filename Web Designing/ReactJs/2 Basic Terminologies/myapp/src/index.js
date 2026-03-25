import React from 'react';
import {createRoot} from  'react-dom/client';

// jsx
const data = <blockquote>
    <h2>Welcome To React Js</h2>
    <p>This is an example of React js</p>
</blockquote>
createRoot(document.getElementById("root")).render(data);