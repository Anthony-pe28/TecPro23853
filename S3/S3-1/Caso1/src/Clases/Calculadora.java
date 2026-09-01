package Clases;

public class Calculadora {
	/*
	Crea una clase Calculadora con un método llamado sumar que tenga tres versiones
	sobrecargadas:
	Una que reciba dos enteros.
	Otra que reciba tres enteros.
	Otra que reciba dos números de tipo double. 
	 */
	private int nint1, nint2, nint3;
	private double ndbl1, ndbl2;

	//Constructor
	public Calculadora(int nint1, int nint2) {
		this.nint1 = nint1;
		this.nint2 = nint2;
	}
	
	public Calculadora(int nint1, int nint2, int nint3) {
		this.nint1 = nint1;
		this.nint2 = nint2;
		this.nint3 = nint3;
	}
	
	public Calculadora(double ndbl1, double ndbl2) {
		this.ndbl1 = ndbl1;
		this.ndbl2 = ndbl2;
	}

	//Getters and setters
	public int getNint1() {
		return nint1;
	}

	public void setNint1(int nint1) {
		this.nint1 = nint1;
	}

	public int getNint2() {
		return nint2;
	}

	public void setNint2(int nint2) {
		this.nint2 = nint2;
	}

	public int getNint3() {
		return nint3;
	}

	public void setNint3(int nint3) {
		this.nint3 = nint3;
	}

	public double getNdbl1() {
		return ndbl1;
	}

	public void setNdbl1(double ndbl1) {
		this.ndbl1 = ndbl1;
	}

	public double getNdbl2() {
		return ndbl2;
	}

	public void setNdbl2(double ndbl2) {
		this.ndbl2 = ndbl2;
	}
	
	//Metodos
	public int Sumar (int n1, int n2) {
		return n1+n2;
	}
	public int Sumar (int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	public double Sumar (Double d1, Double d2) {
		return d1+d2;
	}
}
