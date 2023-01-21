import React from "react";
import "./App.css";
import { useNavigate } from "react-router-dom";

function Home() {
  const navigate = useNavigate();
  return (
    <header className="App-header">
      <p className="para"> InvestX </p>
      <button
        className="click"
        onClick={() => {
          navigate("/insight");
        }}
      >
        {" "}
        CLICK ME{" "}
      </button>
      <p className="para-2">tips</p>
    </header>
  );
}
export default Home;
