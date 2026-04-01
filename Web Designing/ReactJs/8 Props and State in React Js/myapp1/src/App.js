import logo from './logo.svg';
import './App.css';
import React from 'react';
import data from './data.json';
class App extends React.Component{
  render(){
    return (<>
      <table border={1} cellSpacing={0}>
        <tr>
          <th>S.No</th>
          <th>UserId</th>
          <th>Id</th>
          <th>Title</th>
          <th>Body</th>
        </tr>
        {
          data.map((obj,index)=>{
            return(<tr>
              <td>{index+1}</td>
              <td>{obj.userId}</td>
              <td>{obj.id}</td>
              <td>{obj.title}</td>
              <td>{obj.body}</td>
            </tr>);
          })
        }
      </table>
    </>);}
}

export default App;
