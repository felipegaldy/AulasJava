package br.com.generation.metodos;

public class TestaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro1 = new Carro();
		carro1.cor =  "Preto";
		carro1.modelo = "BMW X1";
		carro1.velocidadeAtual = 0;
		carro1.velocidadeMaxima = 320;
		
		
		carro1.liga();
		carro1.acelera(87);
		
		System.out.println(carro1.velocidadeAtual);

	}

}
