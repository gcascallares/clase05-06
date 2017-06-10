package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testBarDeLosNoHomeros {

	@Test
	public void testQueCuentaCantidadDeClientes(){
	Bar mibar = new Bar();
	Cliente cliente1 = new Cliente("homero",100d);
	mibar.admitirClientes(cliente1);
	assertEquals(1,mibar.obtenerCantidadDeClientes(),0.01);
	}

}
