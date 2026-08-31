package Clases;

public class Numero {
	private double NumeroReal;

	public Numero(double numeroReal) {
		NumeroReal = numeroReal;
	}

	public double getNumeroReal() {
		return NumeroReal;
	}

	public void setNumeroReal(double numeroReal) {
		NumeroReal = numeroReal;
	}
	
	public double Cuadrado() {
		return NumeroReal*NumeroReal;
	}
	public double Cubo() {
		return NumeroReal*NumeroReal*NumeroReal;
	}
}
