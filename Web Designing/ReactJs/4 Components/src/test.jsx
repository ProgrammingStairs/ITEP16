export const Header = ()=>{ // named export
    return(<>
        <h2>Header Section</h2>
        <p>This is Header Section</p>
    </>);
}
export var Navbar =  function(){ // named export
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
export function Contact(){ // named export
    return(<>
        <h2>Contact Section</h2>
        <p>This is Contact Section</p>
    </>);
}
export default function Footer(){ // default export
    return(<>
        <h2>Footer Section</h2>
        <p>This is Footer Section</p>
    </>);
}

export {About}; // named export
