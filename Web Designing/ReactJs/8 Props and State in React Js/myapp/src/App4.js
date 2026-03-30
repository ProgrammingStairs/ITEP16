import logo from './logo.svg';
import './App.css';
import React from 'react';

function MyFunComponent(props){
  return (<>
    BookName : {props.book.bookName} <br/>
    AuthorName : {props.book.authorName} <br/>
    Price : {props.book.price} <br/>
  </>);
}
class MyClassComponent extends React.Component{
  render(){
    // console.log(this);
    
    return(<>
      <br/>BookName : {this.props.book.bookName} <br/>
      AuthorName : {this.props.book.authorName} <br/>
      Price : {this.props.book.price} <br/>
    </>);
  }
}
function App() {
  var bookObj = {
      bookName:"Java",
      authorName:"James Gosling",
      price:5678
  }
  return (<>
    <MyFunComponent book={bookObj} />
    <MyClassComponent book={bookObj} />
  </>);
}

export default App;
