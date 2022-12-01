import'./Header.css'
import Search from './Search';

function Header() {
    return(
        <header className="container-header">
            <h1>
                ASSEMBLÉIA DE DEUS
            </h1>               
            <h5>
                MIN. SÃO GOTARDO-MG
            </h5>
            <Search />           
        </header>
    )
}
export default Header;