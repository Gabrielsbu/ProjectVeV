package testes;

import DAO.FuncionarioDAO;
import VeV.Veri;
import model.Funcionario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 
 * @author ielma
 */
public class testeUnidade {
    private Veri v;

    public testeUnidade() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        v = new Veri();
    }

    @After
    public void tearDown() {
    }

    

    @Test

    public void testNomeGeralFuncionario() {

        assertEquals(true, v.verificarNomeDoFuncionario("!Gabriel321"));

    }

    @Test
    public void verificarPrimeiroDigitoFuncionario() {

        assertEquals(false, v.verificarNomeDoFuncionario("V"));

    }

    @Test
    public void verificarPrimeiroDigitoFuncionarioC() {

        assertEquals(true, v.verificarNomeDoFuncionario("!"));

    }

    @Test
    public void testNomeCNumero() {

        assertEquals(false, v.verificarNomeDoFuncionario("2323"));
    }

    @Test
    public void testSenhaGeral() {

        assertEquals(true, v.validarSenhaGeral("Verificacao123!"));

    }

    @Test
    public void testSenhaCLetraMaiuscula() {

        assertEquals(false, v.validarSenhaGeral("2"));

    }

    @Test
    public void testRGComNumero() {

        assertEquals(false, v.validarRGComNumero("Validacao1"));

    }

    @Test
    public void testCPFGeral() {

        assertEquals(true, v.validarCPFComNumero("11219823488"));

    }

    @Test
    public void testCPfComLetra() {

        assertEquals(false, v.validarCPFComNumero("1121982348a"));

    }

    //EMA FERRAMENTA DE TESTE I.A;
    @Test
    public void testCPfcComMaisDe11Numeros() {

        assertEquals(true, v.validarCPFComNumero("11219823488"));

    }

    @Test
    public void testCPfcComMenos11Numeros() {

        assertEquals(false, v.validarCPFComNumero("112188"));

    }

    @Test
    public void testCPFComCharEspecial() {

        assertEquals(false, v.validarCPFComNumero("!34888"));

    }

    @Test
    public void testCPFSemNada() {

        assertEquals(false, v.validarCPFComNumero(""));

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
