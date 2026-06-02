import logo from './logo.svg';
import './App.css';
import Header from './component/Header.js';
import Footer from './component/Footer.js';
import LeftSection from './component/LeftSection.js';
import RightSection from './component/RightSection.js';

function App() {
  return (<>
    <Header/>
    <div>
      <LeftSection/>
      <RightSection/>
    </div>
    <Footer/>
  </>);
}

export default App;
