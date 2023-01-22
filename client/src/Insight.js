import React, { useState } from "react";

function Insight() {
  const [name, setName] = useState("");
  const [place, setPlace] = useState("");
  const [animal, setAnimal] = useState("");
  const [thing, setThing] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();
    alert(`The name you entered was: ${name} ${place} ${animal} ${thing}`);
  };

  return (
    <div className="input-style">
      <div className="input-f">
        <form onSubmit={handleSubmit}>
          <label>
            Enter your name:
            <input
              type="number"
              value={name}
              onChange={(e) => setName(e.target.value)}
            />
          </label>
          <br></br>
          <label>
            Enter your place:
            <input
              type="number"
              value={place}
              onChange={(e) => setPlace(e.target.value)}
            />
          </label>
          <br></br>
          <label>
            Enter your animal:
            <input
              type="number"
              value={animal}
              onChange={(e) => setAnimal(e.target.value)}
            />
          </label>
          <br></br>
          <label>
            Enter your thing:
            <input
              type="number"
              value={thing}
              onChange={(e) => setThing(e.target.value)}
            />
          </label>
          <br></br>

          <input type="submit" />
        </form>
      </div>
    </div>
  );
}

export default Insight;
