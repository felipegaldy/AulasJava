package br.com.generation.classes2;

public class Carro {
	//Atributos
	String cor;
	String modelo;
	int ano;
	boolean legalizado;
	int velocidade;
	
	//Métodos
	void acelerar(int aceleracao) throws InterruptedException {
		System.out.println("Acelerando...");
		while(velocidade <= aceleracao) {
			velocidade += 2;
			Thread.sleep(500);
		}
		
	}
	void freiar(int reduzir) {
		System.out.println("Acelerando...");
		velocidade -= reduzir;
	}
}
