package br.edu.figplanas;

public class Retangulo {

	//Atributos:
	public double base;
	public double altura;
	public double area;
	
	//Metodos:
	
	public void calcArea(double b, double h) {
		base = b;
		altura = h;
		
		if (base > 0 && altura > 0) {
			
		area = base * altura;
		System.out.println("A �rea do ret�ngulo �: " + area);
		}
		else {
			System.out.println("Os valores s�o inv�lidos!");
		}
	}
}
