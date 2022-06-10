package br.com.generation.classes2;

public class TestaCarro {

	public static void main(String[] args) throws InterruptedException {
		// estanciar um objeto = criar objeto
		//classe -> objeto --> construtor
		Carro carro1 = new Carro();
		
		carro1.modelo = "BMW X1";
		carro1.cor	=	"Preto";
		carro1.ano = 2016;
		carro1.legalizado = true;
		carro1.velocidade = 0;
		
		carro1.acelerar(100);
		
		System.out.println("Modelo: "+ carro1.modelo);
		System.out.println("Cor: "+ carro1.cor);
		System.out.println("Ano: "+ carro1.ano);
		System.out.println("Legalizado: "+ carro1.legalizado);
		
		System.out.println("Acelerando...");
		System.out.println("Velocidade: "+ carro1.velocidade);
		
		carro1.freiar(70);
		System.out.println("Reduzindo..."+ carro1.velocidade);
		

	}

}
