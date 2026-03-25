function myFun(userObj){
    return `Hello ${userObj.name}, you live in ${userObj.address} and you are ${new Date().getFullYear()-userObj.yob} years old`;
}
var obj = {
    name : "Peter Parker",
    address : "Indore",
    yob : 1947
}
var content = <q>{myFun(obj)}</q>
export default content; // default export