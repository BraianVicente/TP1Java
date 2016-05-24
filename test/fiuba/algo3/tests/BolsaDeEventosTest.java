package fiuba.algo3.tests;

import fiuba.algo3.modelo.Evento;
import fiuba.algo3.modelo.BolsaDeEventos;

import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class BolsaDeEventosTest {

	@Test
	public void testBolsaNuevaSeCreaVacia() {
	    BolsaDeEventos bolsa = new BolsaDeEventos();
	    Assert.assertTrue(bolsa.estaVacia());
	}

	@Test
	public void testBolsaConUnElementoNoEstaVacia() {
	    BolsaDeEventos bolsa = new BolsaDeEventos();
	    Evento e = new Evento("nombre", new ArrayList(), new Date());
	    
	    bolsa.agregar(e);
	    
	    Assert.assertFalse(bolsa.estaVacia());
	}
}