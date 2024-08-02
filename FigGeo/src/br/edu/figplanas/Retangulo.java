package br.edu.figplanas;

public class Retangulo {

	//Atributos:
	public double base;
	public double altura;
	public double area;
	
	//Metodos:
	
	public void calcArea() {
		area = base * altura;
		System.out.println("A área do retângulo é: " + area);
	}
}
