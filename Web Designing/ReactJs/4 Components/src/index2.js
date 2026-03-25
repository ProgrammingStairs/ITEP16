import React from 'react';
import {createRoot} from 'react-dom/client';

// class component 

// class MyComponent extends React.Component{
//     render(){
//         return "class Hello World";
//     };
// }

// class MyComponent extends React.Component{
//     render(){
//         return <div>class Hello World</div>;
//     };
// }

// class MyComponent extends React.Component{
//     render(){
//         return (<div>
//                 <div>Hello World</div>
//                 <p>This is an example of React Js</p> 
//         </div>);
//     };
// }

// class MyComponent extends React.Component{
//     render(){
//         return (<React.Fragment>
//                 <div>Hello World</div>
//                 <p>This is an example of React Js</p> 
//         </React.Fragment>);
//     };
// }

class MyComponent extends React.Component{
    render(){
        return (<>
                <div>Hello World</div>
                <p>This is an example of React Js</p> 
        </>);
    };
}

createRoot(document.getElementById("root")).render(<MyComponent/>);