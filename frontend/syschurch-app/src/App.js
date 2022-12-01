import Sidenav from "./components/content/Sidenav/Sidenav";
import Header from "./components/content/Header/Header";
import MainContent from "./components/content/MainContent/MainContent";
import './global.css'

function App() {
  return (
    <div>
      <Sidenav/>
      <header className="container-app">
        <Header/>
      </header>
      
      <MainContent/>
    </div>
  );
}

export default App;
