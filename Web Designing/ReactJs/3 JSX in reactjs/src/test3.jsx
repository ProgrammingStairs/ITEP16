var num = parseInt(prompt("Enter number"));

// var str='';
// for(let i=1;i<=10;i++){
//     str+=num+" x "+i+" = "+(num*i)+"\n";
// }
// var content = <p>{alert(str)}</p>

var data=[];
for(let i=1;i<=10;i++){
    data.push(num+" x "+i+" = "+(num*i));
}
var str = data.map((line)=>{
    return <div>{line}</div>
});
var content = <p>{str}</p>

export default content; // default export