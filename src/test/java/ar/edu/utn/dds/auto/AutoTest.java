package ar.edu.utn.dds.auto;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.utn.dds.auto.exceptions.AutoNoEncendidoException;
import ar.edu.utn.dds.auto.exceptions.AutoYaEncendidoException;

public class AutoTest {

	@Test
	public void testEncendidoOK() throws AutoYaEncendidoException {
		//Precondicion
		Auto auto = new Auto();
		auto.encender();
		Assert.assertTrue("el auto deberia estar prendido", auto.isPrendido());
		Assert.assertEquals(Auto.TEMP_ENC, auto.getTemperatura(),0.01);
		
	}
	
	@Test(expected = AutoYaEncendidoException.class)
		public void testEncenderEncendido() throws AutoYaEncendidoException {
			Auto auto = new Auto();
			auto.encender();
			auto.encender();
					
		
	}
	
	@Test(expected = AutoNoEncendidoException.class)
	public void testApagarAutoApagado() throws AutoNoEncendidoException {
		Auto auto = new Auto();
		auto.apagar();
	}
	
	@Test(expected = AutoNoEncendidoException.class)
	public void testAcelerarAutoNoEncendido() throws AutoNoEncendidoException, AutoYaEncendidoException {
		Auto auto = new Auto();
		auto.acelerar(10);
	}
}
