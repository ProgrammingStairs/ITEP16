import React from 'react';
import {createRoot} from 'react-dom/client';
import strNew, { str1, str2 } from './test4.jsx';

createRoot(document.getElementById("root1")).render(str1);
createRoot(document.getElementById("root2")).render(str2);
createRoot(document.getElementById("root3")).render(strNew);