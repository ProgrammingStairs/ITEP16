var content1 = <p>This is an <mark>example</mark> of JSX in React</p>
var str1 = <i>{content1}</i>

var content2 = <p>This is an example of JSX in React</p>
var str2 = <big>{content2}</big>

var content3 = <p>This is an example of JSX in React</p>
var str3 = <strong>{content3}</strong>

export {str1,str2}; // named export
export default str3; // default export

// only one default export is possible
// but multiple named export are possible