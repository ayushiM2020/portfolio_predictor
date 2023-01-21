import logo from "./logo.svg";
import "./App.css";

function App() {
  return (
    <div className="app">
      <div className="head">
        <h1>InvestX</h1>
      </div>
      <div className="body">
        <form>
          <label>
            Name:
            <input type="text" name="name" />
          </label>
          <input type="submit" value="Submit" />
        </form>
      </div>
    </div>
  );
}

export default App;
