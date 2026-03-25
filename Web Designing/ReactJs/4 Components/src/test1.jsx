import React from 'react';
export class Header extends React.Component{ // named export
    render(){
        return(<>
            <h2>Header Section</h2>
            <p>This is Header Section</p>
        </>);    
    }
}

export class Navbar extends React.Component{ // named export
    render(){
        return(<>
            <h2>Navbar Section</h2>
            <p>This is Navbar Section</p>
        </>);    
    }
}
class About extends React.Component{ // named export
    render(){
        return(<>
            <h2>About Section</h2>
            <p>This is About Section</p>
        </>);    
    }
}
export class Contact extends React.Component{ // named export
    render(){
        return(<>
            <h2>Contact Section</h2>
            <p>This is Contact Section</p>
        </>);    
    }
}

class Footer extends React.Component{
    render(){
        return(<>
            <h2>Footer Section</h2>
            <p>This is Footer Section</p>
        </>);
    }
}
export default Footer; // default export
export {About}; // named export 

