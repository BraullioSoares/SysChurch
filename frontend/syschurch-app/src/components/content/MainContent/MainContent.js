import Container from 'react-bootstrap/Container';
import { Link } from 'react-router-dom';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import "./MainContent.css";

function MainContent() {
    
    return (
        <div className="container-mainContent">
           <Container>  
                <h5 className='h6-MainContent'>Acesso Rápido</h5>   
                <Row>
                    <Col className="col-MainContent" sm>
                        <Link to="/MemberList" className='link-MainContent'>Membros</Link>
                    </Col>
                    <Col className="col-MainContent" sm>
                        <Link to="/MemberList" className='link-MainContent'>Relatórios</Link>
                    </Col>
                    <Col className="col-MainContent" sm>
                        <Link to="/MemberList" className='link-MainContent'>Eventos</Link>
                    </Col>
                </Row>
                <Row>
                    <Col className="col-MainContent" sm>
                    <Link to="/MemberList" className='link-MainContent'>Cartas</Link>
                    </Col>
                    <Col className="col-MainContent" sm>
                    <Link to="/MemberList" className='link-MainContent'>Contas a Pagar</Link>
                    </Col>
                    <Col className="col-MainContent" sm>
                    <Link to="/MemberList" className='link-MainContent'>Inventário</Link>
                    </Col>
                </Row>      
            </Container>
        </div>
    )
}

export default MainContent;