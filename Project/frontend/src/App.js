import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Navbar from './components/Navbar.js';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.min.js';
import Header from './components/Header.js';
import Home from './components/Home.js';
import Login from './components/Login.js';
import SellerRegister from './components/SellerRegister.js';
import UserRegister from './components/UserRegister.js';

function App() {
  return (<>
    <Router>
      <Header/>
      <Navbar/>
      <Routes>
        <Route path="/" element={<Home/>}></Route>
        <Route path="/login" element={<Login/>}></Route>
        <Route path="/seller/register" element={<SellerRegister/>}></Route>
        <Route path="/user/register" element={<UserRegister/>}></Route>

      </Routes>
    </Router>
  </>);
}

export default App;
