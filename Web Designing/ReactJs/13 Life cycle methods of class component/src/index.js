import React, { useEffect, useState } from 'react';
import { createRoot } from 'react-dom/client';

function ExampleComponent() {
  const [count, setCount] = useState(0);

  // Runs once on mount
  useEffect(() => {
    console.log('Component mounted!');
  }, []);

  // Runs on every count change
  useEffect(() => {
    console.log(`Count changed to: ${count}`);
  }, [count]);

  // Cleanup on unmount
  useEffect(() => {
    return () => {
      console.log('Component will unmount');
    };
  }, []);

  return (
    <div>
      <h3>Example Component</h3>
      <p>{count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
}

function App() {
  const [show, setShow] = useState(true);

  return (
    <div>
      <button onClick={() => setShow(!show)}>
        Toggle Component
      </button>

      {show && <ExampleComponent />}
    </div>
  );
}

const root = createRoot(document.getElementById("root"));
root.render(<App />);

