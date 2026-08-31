package Clases;

public class Cilindro {
	private double rdo, alta;

	public Cilindro(double rdo, double alta) {
		this.rdo = rdo;
		this.alta = alta;
	}

	public double getRdo() {
		return rdo;
	}

	public void setRdo(double rdo) {
		this.rdo = rdo;
	}

	public double getAlta() {
		return alta;
	}

	public void setAlta(double alta) {
		this.alta = alta;
	}
	public double Volumen () {
		return Math.PI*Math.pow(rdo, 2)*alta;
	}
}
