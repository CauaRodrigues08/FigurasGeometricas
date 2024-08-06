package br.edu.figplanas;

public class Quadrado {

	//Atributos:
	public double lado;
	public double area;
	
	//Metodos:
	public void calcArea(double b, double h){
		lado = b;
		
		if(lado > 0) {
			
		area = Math.pow(lado, 2);
		System.out.println("A área do quadrado é: " + area);
		}
		else {
			System.out.println();
		}
	}
}
