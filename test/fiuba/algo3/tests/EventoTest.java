package fiuba.algo3.tests;

import fiuba.algo3.modelo.Evento;

import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class EventoTest {

	@Test
	public void testCrearEventoNoLanzaExcepcion() {
	    Calendar c = Calendar.getInstance();
	    c.set( Calendar.YEAR, 2016);
	    c.set( Calendar.MONTH, Calendar.MAY);
	    c.set( Calendar.DATE, 23);
	    c.set( Calendar.HOUR_OF_DAY, 14);
	    Date d = c.getTime();
	    new Evento("nombre", new ArrayList(), d);
	}

}
