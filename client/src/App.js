import "./App.css";
import Home from "./Home";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Insight from "./Insight";

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/insight" element={<Insight />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
