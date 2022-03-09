import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CalculadoraTest {

    //@Test indica que função sera um teste.
    //asserts serão utilizados para verificação.

    @Test
    fun adicaoTest() {

        assertEquals(15.0, Calculadora.adicao (10.0, 5.0))
        /*assertEquals(15, Calculadora.adicao (10, 5))*/

    }
    @Test
    fun subtracaoTest() {

        assertEquals(5.0, Calculadora.subtracao (10.0, 5.0))
       /* assertEquals(5, Calculadora.subtracao (10, 5))*/

    }
    @Test
    fun multiplicacaoTest() {

        assertEquals(50.0, Calculadora.multiplicacao (10.0, 5.0))
        /*assertEquals(50, Calculadora.multiplicacao (10, 5))*/

    }
    @Test
    fun divisaoTest() {

        assertEquals(2.0, Calculadora.divisao (10.0, 5.0))
        /*assertEquals(2, Calculadora.divisao (10, 5))*/

    }


}
