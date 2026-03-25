import React from 'react';
import {createRoot} from 'react-dom/client';

// functional component 

// function MyComponent(){
//     return "Hello World";
// }

// function MyComponent(){
//     return <div>Hello World</div>;
// }

// function MyComponent(){
//     return (<div>
//             <div>Hello World</div>
//             <p>This is an example of React Js</p> 
//     </div>);
// }

// function MyComponent(){
//     return (<React.Fragment>
//             <div>Hello World</div>
//             <p>This is an example of React Js</p> 
//     </React.Fragment>);
// }

function MyComponent(){
    return (<>
            <div>Hello World</div>
            <p>This is an example of React Js</p> 
    </>);
}

createRoot(document.getElementById("root")).render(<MyComponent/>);
