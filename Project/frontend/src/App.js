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
import SellerAddMobile from './components/SellerAddMobile.js';
import SellerAddVariant from './components/SellerAddVariant.js';
import AdminHome from './components/AdminHome.js';
import AdminSellerList from './components/AdminSellerList.js';
import UserHome from './components/UserHome.js';
import SellerHome from './components/SellerHome.js';
import SellerViewMobiles from './components/SellerViewMobiles.js';

function App() {
  return (<>
    <Router>
      <Header/>
      <Navbar/>
      <Routes>
        <Route path="/" element={<Home/>}></Route>
        <Route path="/login" element={<Login/>}></Route>
        <Route path="/seller/register" element={<SellerRegister/>}></Route>
        <Route path="/seller/addMobile" element={<SellerAddMobile/>}></Route>
        <Route path="/user/register" element={<UserRegister/>}></Route>
        <Route path="/admin/adminHome" element={<AdminHome/>}></Route>
        <Route path="/admin/sellerList" element={<AdminSellerList/>}></Route>
        <Route path="/user/userHome" element={<UserHome/>}></Route>
        <Route path="/seller/sellerHome" element={<SellerHome/>}></Route>
        <Route path="/seller/sellerAddVariant" element={<SellerAddVariant/>}></Route>
        <Route path="/seller/viewMobiles" element={<SellerViewMobiles/>}></Route>
        
      </Routes>
    </Router>
  </>);
}

export default App;
