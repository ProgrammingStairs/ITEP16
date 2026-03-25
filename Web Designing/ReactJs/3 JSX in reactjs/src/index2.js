import React from 'react';
import {createRoot} from 'react-dom/client';
import contentDemo from './test1.jsx'; //default import

var rootElement = document.getElementById("root");
createRoot(rootElement).render(contentDemo);