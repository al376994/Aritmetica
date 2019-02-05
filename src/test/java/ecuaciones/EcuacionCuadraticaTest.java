package ecuaciones;

import ecuacion.EcuacionCuadratica;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class EcuacionCuadraticaTest {
    EcuacionCuadratica ecuacionCuadratica;

    @Test
    public void terminoIndependienteCeroTest() {
        ecuacionCuadratica = new EcuacionCuadratica(1.0, 0.0);
        assertThat(ecuacionCuadratica.resolver(), is(0.0));
    }
}
