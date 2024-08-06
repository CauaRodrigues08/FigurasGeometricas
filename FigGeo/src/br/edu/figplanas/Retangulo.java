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
		System.out.println("A área do retângulo é: " + area);
		}
		else {
			System.out.println("Os valores são inválidos!");
		}
	}
}
