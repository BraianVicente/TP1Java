package fiuba.algo3.tests;

import fiuba.algo3.modelo.Invitado;
import fiuba.algo3.modelo.Recurso;

import org.junit.Assert;
import org.junit.Test;

public class RecursoTest {
	@Test
	public void testEstaOcupadoDevuelveFalseSiRecursoNoEstaOcupado() {
	    Invitado i = new Recurso("proyector");
		Assert.assertFalse(i.estaOcupado());
	}
}
