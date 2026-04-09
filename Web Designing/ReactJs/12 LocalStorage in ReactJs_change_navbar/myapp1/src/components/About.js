import { useEffect } from "react";

function About() {
    useEffect(() => {
        localStorage.setItem("navShow", "home");
    }, []);

    return (<blockquote>
        <h2>About Page</h2>
        <p>
            It is a long ll be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).
        </p>
    </blockquote>);
}
export default About;