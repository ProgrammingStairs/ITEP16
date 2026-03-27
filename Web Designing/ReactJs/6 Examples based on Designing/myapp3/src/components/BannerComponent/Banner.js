import bannerStyle from './bannerStyle.module.css';
import banner2 from '../../images/banner2.jpg';
function Banner(){
    return(<div className={bannerStyle.banner}>
            <img src={banner2} className={bannerStyle.bannerImg} alt=""/>
        </div>);
}
export default Banner;