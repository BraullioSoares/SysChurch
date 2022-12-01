import Sidenav from "./components/content/Sidenav/Sidenav";
import Header from "./components/content/Header/Header";
import MainContent from "./components/content/MainContent/MainContent";
import './global.css'

function App() {
  return (
    <div className="container-app">
        <div className="row">
            <div className="col">
                <Sidenav/>
            </div>
            
            <div className="col-10">
                  <header className="container-headerApp">
                      <Header/>
                  </header>
            
                  <div className="row">
                    <MainContent/>
                  </div>
            </div>
          </div>
    </div>
  );
}
export default App;
