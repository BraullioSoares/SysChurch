import Sidenav from "./components/content/Sidenav/Sidenav";
import Header from "./components/content/Header/Header";
import MainContent from "./components/content/MainContent/MainContent";

function App() {
  return (
    <div className="syschurch-app container">
      <Sidenav/>
      <Header/>
      <MainContent/>
    </div>
  );
}

export default App;
