import '../css/style.css';
import logo3 from '../images/logo3.jpg';
import menu from '../images/icons8-menu-50.png';
function Header(){
    return ( <div id="header">
            <div id="logo_section">
                <img src={logo3} id="logo" alt=""/>
            </div>
            <div id="heading_section">
                <h1>Restoria</h1>
            </div>
            <div id="nav">
                <label for="hum">
                    <img src={menu} id="humber" alt=""/>
                </label>
                <input type="checkbox" id="hum"/>
                <ul>
                    <li><a href="index.html">Home</a></li>
                    <li><a href="services.html">Services</a></li>
                    <li><a href="">Product &#9662;</a>
                        <ul>
                            <li><a href="">ProductItem1</a></li>
                            <li><a href="">ProductItem2</a></li>
                            <li><a href="">ProductItem3</a></li>
                            <li><a href="">ProductItem4</a></li>
                            <li><a href="">ProductItem5</a></li>
                        </ul>
                    </li>
                    <li><a href="about.html">About</a></li>
                    <li><a href="contact.html">Contact</a></li>
                    <li><a href="">FAQ</a></li>
                    <li><a href="">Account</a></li>
                </ul>
            </div>
        </div>);
}

export default Header;