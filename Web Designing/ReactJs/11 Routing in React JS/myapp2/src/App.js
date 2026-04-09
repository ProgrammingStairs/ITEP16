import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Routes,Route} from 'react-router-dom';
// import { MemoryRouter as Router, Routes,Route} from 'react-router-dom';
// import { HashRouter as Router, Routes,Route} from 'react-router-dom';

import Header from './components/Header.js';
import Home from './components/Home.js';
import About from './components/About.js';
import Contact from './components/Contact.js';
import Navbar from './components/Navbar.js';
import ContactComp1 from './components/ContactComp1.js';
import ContactComp2 from './components/ContactComp2.js';

function App() {
  return (<>
    <Router>
        <Header/>
        <Navbar/>
        <Routes>
          <Route path="/"  element={<Home/>}/>
          <Route path="/about"  element={<About/>}/>
          <Route path="/contact"  element={<Contact/>}>
            <Route path="contactComp1" element={<ContactComp1/>}/>  
            <Route path="contactComp2" element={<ContactComp2/>}/>  
          </Route>
        </Routes>
    </Router>
  </>);
}

export default App;
