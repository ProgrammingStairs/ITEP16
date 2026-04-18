import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router,Routes,Route } from 'react-router-dom';
import Header from './components/Header.js';
import Navbar from './components/Navbar.js';
import Home from './components/Home.js';
import AddUser from './components/AddUser.js';
import ViewUsers from './components/ViewUsers.js';
function App() {
  return (<>
    <Router>
      <Header/>
      <Navbar/>
      <Routes>
        <Route path="/" element={<Home/>}/>
        <Route path="/addUser" element={<AddUser/>}/>
        <Route path="/viewUsers" element={<ViewUsers/>}/>
      </Routes>
    </Router>
  </>);
}

export default App;
