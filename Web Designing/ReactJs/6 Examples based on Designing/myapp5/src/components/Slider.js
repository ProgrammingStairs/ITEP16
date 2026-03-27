import Carousel from 'react-bootstrap/Carousel';
import ExampleCarouselImage from './ExampleCarouselImage.js';
import banner from '../images/banner2.jpg';
import banner1 from '../images/user.avif';

function Slider() {
  return (
    <Carousel>
      <Carousel.Item>

        <ExampleCarouselImage src={banner} alt="First slide" /> 
               <Carousel.Caption>
          <h3>First slide label</h3>
          <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>

        <ExampleCarouselImage src={banner1} alt="First slide" />        <Carousel.Caption>
          <h3>Second slide label</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
 
        <ExampleCarouselImage src={banner} alt="First slide" />       <Carousel.Caption>
          <h3>Third slide label</h3>
          <p>
            Praesent commodo cursus magna, vel scelerisque nisl consectetur.
          </p>
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  );
}

export default Slider;