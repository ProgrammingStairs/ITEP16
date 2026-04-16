import logo from './logo.svg';
import './App.css';
import Header from './components/Header.js';
import Footer from './components/Footer.js';
import LeftSection from './components/LeftSection.js';
import RightSection from './components/RightSection.js';
function App() {
  return (<>
    <Header/>
    <div id="row">
      <LeftSection/>
      <RightSection/>
    </div>
    <Footer/>
  </>);
}

export default App;
