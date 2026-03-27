function ExampleCarouselImage({ src, alt }) {
  return (
    <img
      className="d-block w-100"
      src={src}
      alt={alt}
      style={{ height: "400px", objectFit: "cover" }}
    />
  );
}

export default ExampleCarouselImage;
