package fiuba.algo3.tests;

import fiuba.algo3.modelo.Invitado;
import fiuba.algo3.modelo.Persona;

import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {
	@Test
	public void testEstaOcupadoDevuelveFalse() {
	    Invitado i = new Persona("juan");
		Assert.assertFalse(i.estaOcupado());
	}
}
