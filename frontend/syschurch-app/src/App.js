import {BrowserRouter, Routes, Route} from "react-router-dom";
import Home from './components/content/Home/Home';
import TestFinancas from './components/content/TESTE/TestFinancas';
import TestADM from './components/content/TESTE/TestADM';
import TestSocial from './components/content/TESTE/TestSocial';
import './global.css'

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/administracao" element={<TestADM />} />
        <Route path="/financas" element={<TestFinancas />} />
        <Route path="/social" element={<TestSocial />} />
      </Routes>  
    </BrowserRouter>
  );
}
export default App;
