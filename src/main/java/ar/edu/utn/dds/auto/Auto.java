package ar.edu.utn.dds.auto;

import ar.edu.utn.dds.auto.exceptions.AutoNoEncendidoException;
import ar.edu.utn.dds.auto.exceptions.AutoYaEncendidoException;

public class Auto {
	
	public static final double TEMP_ENC = 70;

	private boolean prendido;
	private double temperatura = 0;
	public boolean isPrendido() {
		return prendido;
	}
	public void setPrendido(boolean prendido) {
		this.prendido = prendido;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double d) {
		this.temperatura = d;
	}
	public void encender() throws AutoYaEncendidoException {
		if (this.isPrendido()) {
			throw  new AutoYaEncendidoException();
		}
		this.prendido = true;
		this.temperatura += TEMP_ENC;
	}
	
	
	public void apagar() throws AutoNoEncendidoException {
		if(!this.isPrendido()) {
			throw new AutoNoEncendidoException();
		}
		
		this.prendido = false;
	}
	
	
	public void acelerar(int km) throws AutoNoEncendidoException {
		if(!this.isPrendido()) {
			throw new AutoNoEncendidoException();
		}
		
		this.setTemperatura(this.temperatura + (0.2 * km));
		
	}
	
	
	
	
	
}
