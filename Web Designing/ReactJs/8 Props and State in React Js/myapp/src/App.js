import logo from './logo.svg';
import './App.css';
import React from 'react';

function MyFunComponent(props){
  return (<>
    <h3>Functional Component</h3>
    <table border={1}>
      <tr>
        <th>S.No</th>
        <th>BookName</th>
        <th>BookAuthor</th>
        <th>Price</th>
      </tr>
      {
        props.book.map((bookObj,index)=>{
          return (<tr>
            <td>{index+1}</td>
            <td>{bookObj.bookName}</td>
            <td>{bookObj.authorName}</td>
            <td>{bookObj.price}</td>
          </tr>);
        })
      }
    </table>
  </>);
}
class MyClassComponent extends React.Component{
  render(){
    // console.log(this);
    
    return(<>
         <h3>Class Component</h3>
    <table border={1}>
      <tr>
        <th>S.No</th>
        <th>BookName</th>
        <th>BookAuthor</th>
        <th>Price</th>
      </tr>
      {
        this.props.book.map((bookObj,index)=>{
          return (<tr>
            <td>{index+1}</td>
            <td>{bookObj.bookName}</td>
            <td>{bookObj.authorName}</td>
            <td>{bookObj.price}</td>
          </tr>);
        })
      }
    </table>

    </>);
  }
}
var bookArr = [{
      bookName:"Java",
      authorName:"James Gosling",
      price:5678
  },{
      bookName:"Java",
      authorName:"James Gosling",
      price:5678
  },{
      bookName:"Java",
      authorName:"James Gosling",
      price:5678
  },{
      bookName:"Java",
      authorName:"James Gosling",
      price:5678
  },{
      bookName:"Java",
      authorName:"James Gosling",
      price:5678
  }]
function App() {
  return (<>
    <MyFunComponent book={bookArr} />
    <MyClassComponent book={bookArr} />
  </>);
}

export default App;
