import Nav from 'react-bootstrap/Nav';
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

            <nav defaultActiveKey="/home" className="flex-column " >
                <Nav.Link className="sideNave-nav-link" href="/home">Administração</Nav.Link>
                <Nav.Link className="sideNave-nav-link" href="/Finanças">Finanças</Nav.Link>
                <Nav.Link className="sideNave-nav-link" href="/Social">Social</Nav.Link>
                <Nav.Link className="sideNave-nav-link" href="/Sair">Sair</Nav.Link>                
            </nav> 
        </div>   
        
    )
}
export default Sidenav;