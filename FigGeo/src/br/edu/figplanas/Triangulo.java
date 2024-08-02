package br.edu.figplanas;

public class Triangulo {
	
	//Atributos:
	public double base;
	public double altura;
	public double area;
	
	//Metodos:
	public void calcArea() {
		area = (base * altura)/2;
		System.out.println("A área do triângulo é: " + area);	
	}
	
}


