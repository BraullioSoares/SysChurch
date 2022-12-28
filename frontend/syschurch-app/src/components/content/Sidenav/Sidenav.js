import {Link} from 'react-router-dom';
import { HiOutlineUserCircle } from "react-icons/hi";
import { BsList } from "react-icons/bs";
import './SideNav.css'

function Sidenav() {
    return (
        <div className='container-nav'>
            <button className='button-sideNave'>
                <BsList />
            </button>

            <div className='div-user-icon'>
                <HiOutlineUserCircle className='user-icon'/>
                <h6>Pr. Francisco Batista</h6>
            </div>            

            <nav>
                
                <ul className='sideNave-ul'>
                    <li className="sideNave-li">
                        <Link to="/TestADM">Administração</Link>
                    </li>
                    <li className="sideNave-li">
                        <Link to="/TestFinancas" className="sideNave-link">Finanças</Link>
                    </li>
                    <li className="sideNave-li">
                        <Link to="/TestSocial">Social</Link>
                    </li>
                    <li className="sideNave-li">
                        <Link to="/">Sair</Link>
                    </li>
                </ul>
                
            </nav> 
        </div>   
        
    )
}
export default Sidenav;