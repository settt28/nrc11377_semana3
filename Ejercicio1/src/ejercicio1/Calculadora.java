package ejercicio1;

public class Calculadora {
private int n1,n2,n3;
private double d1,d2;
public Calculadora(int n1, int n2) {
	this.n1 = n1;
	this.n2 = n2;
}
public Calculadora(int n1, int n2, int n3) {
	this.n1 = n1;
	this.n2 = n2;
	this.n3 = n3;
}
public Calculadora(double d1, double d2) {
	this.d1 = d1;
	this.d2 = d2;
}
public int Sumar(int n1, int n2) {
	return n1+n2;
}
public int Sumar(int n1, int n2, int n3) {
	return n1+n2+n3;
}
public double Sumar(double d1, double d2) {
	return d1+d2;
}
}

/*1. Ejercicio: Crea una clase Calculadora con un método llamado sumar que tenga tres versiones
sobrecargadas:
• Una que reciba dos enteros.
• Otra que reciba tres enteros.
• Otra que reciba dos números de tipo double.*/