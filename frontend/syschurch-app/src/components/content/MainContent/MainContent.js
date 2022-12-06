import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import "./MainContent.css"

function MainContent() {
    return(
        <div className="container-mainContent">
           <Container>  
                <h5 className='h6-MainContent'>Acesso Rápido</h5>   
                <Row>
                    <Col className="col-MainContent" sm>
                        <button className='bottom-MainContent'>Membros</button>
                    </Col>
                    <Col className="col-MainContent" sm>
                        <button className='bottom-MainContent'>Relatórios</button>
                    </Col>
                    <Col className="col-MainContent" sm>
                        <button className='bottom-MainContent'>Eventos</button>
                    </Col>
                </Row>
                <Row>
                    <Col className="col-MainContent" sm>
                        <button className='bottom-MainContent'>Cartas</button>
                    </Col>
                    <Col className="col-MainContent" sm>
                        <button className='bottom-MainContent'>Contas a Pagar</button>
                    </Col>
                    <Col className="col-MainContent" sm>
                        <button className='bottom-MainContent'>Inventário</button>
                    </Col>
                </Row>      
            </Container>
        </div>
    )
}

export default MainContent;