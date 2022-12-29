import React from "react";
import { Routes, Route } from 'react-router-dom'
import Home from './components/content/Home/Home'
import MemberList from "./components/content/MemberList/MemberList";
import TestADM from './components/content/TESTE/TestADM' 
import TestFinancas from './components/content/TESTE/TestFinancas'
import TestSocial from './components/content/TESTE/TestSocial'

export default function Routing() {
    return(
        <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/TestADM" element={<TestADM />} />
            <Route path="/TestFinancas" element={<TestFinancas />} />
            <Route path="/TestSocial" element={<TestSocial />} />
            <Route path="/MemberList" element={<MemberList />} />
        </Routes>  
    );
}