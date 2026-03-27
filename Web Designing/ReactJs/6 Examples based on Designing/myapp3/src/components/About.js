import '../css/style.css';
import logo from '../images/logo3.jpg';
function About(){
    return ( <div id="about">
            <h1>About Restoria...</h1> <br/>
            <div id="aboutleft">
                <img src={logo} alt=""/>
            </div>
            <div id="aboutright">
                Lorem ipsum dolor sit, amet consectetur adipisicing elit. Maiores doloribus, eligendi atque sunt quod libero reprehenderit sit nobis possimus hic blanditiis odit enim quibusdam qui necessitatibus inventore est ab dolore laudantium mollitia doloremque accusantium quos vitae. Nesciunt ea, soluta deserunt officiis eveniet, perferendis, temporibus nisi iure hic tempore culpa iusto? <br/><br/>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Placeat, ea totam? Enim est numquam, iure id, eveniet saepe maxime doloribus earum facere placeat laboriosam ipsum iste? Earum, molestias! Sapiente aliquid exercitationem autem! Temporibus consectetur nulla fugit, hic iste, aspernatur deleniti explicabo exercitationem mollitia similique, facilis culpa nisi voluptas illo tempora.
            </div>
        </div>);
}
export default About;