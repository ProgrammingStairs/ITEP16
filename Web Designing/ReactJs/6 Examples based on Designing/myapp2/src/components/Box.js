import '../css/style.css';
import banner from '../images/banner2.jpg';
function Box(){
    return (<div id="boxes">
            <h1>What We Serve...</h1>
            <br/>
            <div id="box">
                <div id="boxImage">
                    <img src={banner} id="boxImg" alt=""/>
                </div>
                <div id="boxContent">
                    <h3>Dish #1</h3>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ea, ad!</p>
                    <button>Order Now</button>
                </div>
            </div>
              <div id="box">
                <div id="boxImage">
                    <img src={banner} id="boxImg" alt=""/>
                </div>
                <div id="boxContent">
                    <h3>Dish #2</h3>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ea, ad!</p>
                    <button>Order Now</button>
                </div>
            </div>
              <div id="box">
                <div id="boxImage">
                    <img src={banner} id="boxImg" alt=""/>
                </div>
                <div id="boxContent">
                    <h3>Dish #3</h3>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ea, ad!</p>
                    <button>Order Now</button>
                </div>
            </div>
        </div>);
}
export default Box;