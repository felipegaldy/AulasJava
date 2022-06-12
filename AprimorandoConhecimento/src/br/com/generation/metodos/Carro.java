package br.com.generation.metodos;

public class Carro {
	
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	void liga() {
		System.out.println("Vruumm ... Vrum ...");
	}
	
	void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		velocidadeAtual = velocidadeNova;
	}
	
	int pegaMarcha() {
		if (this.velocidadeAtual < 0) {
			return -1;			
		}
		if(this.velocidadeAtual >=0 && this.velocidadeAtual <40) {
			return 1;
		}
		if(this.velocidadeAtual >=40 && this.velocidadeAtual <80) {
			return 2;
		}
		return 3;
		
	}

}
