package fiuba.algo3.tests;

import fiuba.algo3.modelo.Evento;
import fiuba.algo3.modelo.BolsaDeEventos;

import java.util.Date;
import java.util.Calendar;
import java.util.List;
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

	@Test
	public void testFiltrarPorNombreExistente() {
	    BolsaDeEventos bolsa = new BolsaDeEventos();
	   
	    List<String> invitados = new ArrayList();
	    invitados.add("Robb Stark");
	    invitados.add("Catelin Stark");
	    invitados.add("Walder Frey");
	    invitados.add("Roose Bolton");
	    Evento e = new Evento("Red Wedding", invitados, new Date());
	    
	    bolsa.agregar(e);
	    BolsaDeEventos bolsaFiltrada = bolsa.filtrarPorNombre("Robb Stark");
	    
	    Assert.assertFalse(bolsaFiltrada.estaVacia());
	}

	@Test
	public void testFiltrarPorNombreInexistente() {
	    BolsaDeEventos bolsa = new BolsaDeEventos();
	   
	    List<String> invitados = new ArrayList();
	    invitados.add("Robb Stark");
	    invitados.add("Catelin Stark");
	    invitados.add("Walder Frey");
	    invitados.add("Roose Bolton");
	    Evento e = new Evento("Red Wedding", invitados, new Date());
	    
	    bolsa.agregar(e);
	    BolsaDeEventos bolsaFiltrada = bolsa.filtrarPorNombre("Ramsay Bolton");
	    
	    Assert.assertTrue(bolsaFiltrada.estaVacia());
	}
}
