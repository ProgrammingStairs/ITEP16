import banner from '../public/images/banner.png';
import '../public/css/style.css';
function Home() {
    return (<div>
        <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src={banner} class="d-block w-100" alt="..." />
                </div>
                <div class="carousel-item">
                    <img src={banner} class="d-block w-100" alt="..." />
                </div>
                <div class="carousel-item">
                    <img src={banner} class="d-block w-100" alt="..." />
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
        <div className='row p-5'>
            <blockquote>
                <h4>Mobilekart | <span className='text-primary'>Get Discount of 25% on Every Purchase</span></h4>
                <p>
                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. <br /><br />
                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
                </p>
            </blockquote>
        </div>
        <div className='row p-5' id="imgSection">
            <h4>Gallery | <span className="text-primary">Grab The Best Deal</span></h4><br/><br/>
            <div className="card" style={{width: "21rem",margin:"20px"}}>
                <img src={banner} class="card-img-top" alt="..."/>
                    <div class="card-body">
                        <h6 class="card-title">Galaxy S25 Ultra</h6>
                        <p class="card-text text-justify">
                            <b>Brand : </b> Samsung <br/>
                            <b>Model : </b> Galaxy S25 Ultra <br/>
                            <b>Storage : </b> 128GB | 512GB <br/>
                            <b>Color : </b> Golden | Titanic <br/>
                            <b>Processor : </b> SnapDragan <br/>
                        </p>
                        <button className="btn btn-danger w-100">Buy | &#8377;1,25,000/-</button>
                    </div>
            </div>
            <div className="card" style={{width: "21rem",margin:"20px"}}>
                <img src={banner} class="card-img-top" alt="..."/>
                    <div class="card-body">
                        <h6 class="card-title">Galaxy S25 Ultra</h6>
                        <p class="card-text text-justify">
                            <b>Brand : </b> Samsung <br/>
                            <b>Model : </b> Galaxy S25 Ultra <br/>
                            <b>Storage : </b> 128GB | 512GB <br/>
                            <b>Color : </b> Golden | Titanic <br/>
                            <b>Processor : </b> SnapDragan <br/>
                        </p>
                        <button className="btn btn-danger w-100">Buy | &#8377;1,25,000/-</button>
                    </div>
            </div>
            <div className="card" style={{width: "21rem",margin:"20px"}}>
                <img src={banner} class="card-img-top" alt="..."/>
                    <div class="card-body">
                        <h6 class="card-title">Galaxy S25 Ultra</h6>
                        <p class="card-text text-justify">
                            <b>Brand : </b> Samsung <br/>
                            <b>Model : </b> Galaxy S25 Ultra <br/>
                            <b>Storage : </b> 128GB | 512GB <br/>
                            <b>Color : </b> Golden | Titanic <br/>
                            <b>Processor : </b> SnapDragan <br/>
                        </p>
                        <button className="btn btn-danger w-100">Buy | &#8377;1,25,000/-</button>
                    </div>
            </div>
        </div>
        <div className="row p-5">
            <div className="col-lg-6">
                <img src={banner} className="d-block w-100" alt="Image"/>
            </div>
            <div className="col-lg-6">
                <h4>About</h4>
                <p>
                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
                </p>
            </div>
            </div>
            <div className="row p-5">
            <div className="col-lg-6">
                <p>
                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
                </p>
            </div>
            <div className="col-lg-6">
                <img src={banner} className="d-block w-100" alt="Image"/>
            </div>
        </div>
        <div className='row p-5'>
            <center>
                All Rights Reserved &copy;| Designed By Itep-16 &trade;
            </center>
        </div>
    </div>);
}
export default Home;