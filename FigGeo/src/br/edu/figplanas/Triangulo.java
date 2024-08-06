package br.edu.figplanas;

public class Triangulo {
	
	//Atributos:
	public double base;
	public double altura;
	public double area;
	
	//Metodos:
	public void calcArea(double b, double h) {
		base = b;
		altura = h;
		
		if(base > 0 && altura > 0) {
			
		area = (base * altura)/2;
		System.out.println("A área do triângulo é: " + area);	
		}
		else {
			System.out.println("Os valores são inválidos!");
		}
	}
	
}


