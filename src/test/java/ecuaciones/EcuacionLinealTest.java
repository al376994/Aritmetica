package ecuaciones;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

import ecuacion.EcuacionLineal;

public class EcuacionLinealTest {

	@Test
	public void terminoIndependienteCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 0); // x + 0 = 0
        assertThat(ecuacionLineal.resolver(), is(0.0));
	}

	@Test
	public void distintosDeCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
        assertThat(ecuacionLineal.resolver(), is(-1.0));

		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
        assertThat(ecuacionLineal.resolver(), is(-0.5));
	}
}
