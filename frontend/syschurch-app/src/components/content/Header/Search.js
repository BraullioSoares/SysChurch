import { Button, Form, InputGroup } from 'react-bootstrap';
import { FcSearch, IconName } from "react-icons/fc";

//Component de Busca com Icon de search

export default function Search() {
    return(

        <InputGroup className="mb-3 width-search">
                <Form.Control
                    placeholder="Entre com sua busca"
                    aria-label="Entre com sua busca"
                    aria-describedby="basic-addon2"
                />  
                <Button>    
                    <FcSearch className='button-search'/>                    
                </Button>  
        </InputGroup>
    );
}