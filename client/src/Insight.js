import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

import { Line } from "react-chartjs-2";
import {
  Chart as ChartJS,
  LineElement,
  CategoryScale,
  LinearScale,
  PointElement,
  Legend,
} from "chart.js";

ChartJS.register(LineElement, CategoryScale, LinearScale, PointElement, Legend);

function Insight() {
  const navigate = useNavigate();

  const [name, setName] = useState("");
  const [place, setPlace] = useState("");
  const [animal, setAnimal] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();
    alert(`The name you entered was: ${parseInt(name, 10)} ${place} ${animal}`);
  };

  const data = {
    labels: ["2023", "2024", "2025", "2026", "2027", "2028"],
    datasets: [
      {
        label: "Real Estate",
        data: [
          parseInt(name, 10),
          parseInt(name, 10) * 1.123,
          parseInt(name, 10) * 1.123 * 0.95,
          parseInt(name, 10) * 1.123 * 0.9 * 1.153,
          parseInt(name, 10) * 1.123 * 0.9 * 1.153 * 1.17,
          parseInt(name, 10) * 1.123 * 0.9 * 1.153 * 1.17 * 0.92,
        ],
        backgroundColor: "black",
        borderColor: "black",
        pointBorderColor: "black",
      },
      {
        label: "Stock",
        data: [
          parseInt(place, 10),
          parseInt(place, 10) * 1.1,
          parseInt(place, 10) * 1.1 * 1.1,
          parseInt(place, 10) * 1.1 * 1.1 * 1.1,
          parseInt(place, 10) * 1.1 * 1.1 * 1.1 * 1.1,
          parseInt(place, 10) * 1.1 * 1.1 * 1.1 * 1.1 * 1.1,
        ],
        backgroundColor: "red",
        borderColor: "red",
        pointBorderColor: "red",
      },
      {
        label: "Bonds",
        data: [
          parseInt(animal, 10),
          parseInt(animal, 10) * 1.03,
          parseInt(animal, 10) * 1.03 * 1.035,
          parseInt(animal, 10) * 1.03 * 1.035 * 1.027,
          parseInt(animal, 10) * 1.03 * 1.035 * 1.027 * 1.021,
          parseInt(animal, 10) * 1.03 * 1.035 * 1.027 * 1.021 * 1.025,
        ],
        backgroundColor: "blue",
        borderColor: "blue",
        pointBorderColor: "blue",
      },
    ],
  };

  //   const options = {

  //   }

  return (
    <div className="input-style">
      <a
        onClick={() => {
          navigate("/");
        }}
      >
        InvestX
      </a>
      <div className="input-f">
        <form onSubmit={handleSubmit}>
          <label>
            Enter your Real Estate:
            <input
              type="number"
              value={name}
              onChange={(e) => setName(e.target.value)}
            />
          </label>
          <br></br>
          <label>
            Enter your Stocks:
            <input
              type="number"
              value={place}
              onChange={(e) => setPlace(e.target.value)}
            />
          </label>
          <br></br>
          <label>
            Enter your Bonds:
            <input
              type="number"
              value={animal}
              onChange={(e) => setAnimal(e.target.value)}
            />
          </label>
          <br></br>

          {/* <input type="submit" /> */}
        </form>
      </div>
      <div className="graph">
        <Line data={data} />
        <h3>Yearwise Projection of Assets</h3>
      </div>
    </div>
  );
}

export default Insight;
