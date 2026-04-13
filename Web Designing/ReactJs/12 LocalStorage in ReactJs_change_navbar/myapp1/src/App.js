import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Routes,Route} from 'react-router-dom';
import Header from './components/Header.js';
import Home from './components/Home.js';
import About from './components/About.js';
import Contact from './components/Contact.js';
import Navbar from './components/Navbar.js';
import Login from './components/Login.js';
import Register from './components/Register.js';
import Profile from './components/Profile.js';
import ViewUser from './components/ViewUser.js';
function App() {
  return (<>
    <Router>
        <Header/>
        <Navbar/>
        <Routes>
          <Route path="/"  element={<Home/>}/>
          <Route path="/about"  element={<About/>}/>
          <Route path="/contact"  element={<Contact/>}/>
          <Route path="/login"  element={<Login/>}/>
          <Route path="/register"  element={<Register/>}/>
          <Route path="/profile"  element={<Profile/>}/>
          <Route path="/viewUser"  element={<ViewUser/>}/>
        </Routes>
    </Router>
  </>);
}

export default App;
