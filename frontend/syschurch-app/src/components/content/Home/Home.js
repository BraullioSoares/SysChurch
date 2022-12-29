import Header from '../Header/Header';
import MainContent from '../MainContent/MainContent';
import Sidenav from '../Sidenav/Sidenav';
import './Home.css'

export default function Home() {
    return(
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