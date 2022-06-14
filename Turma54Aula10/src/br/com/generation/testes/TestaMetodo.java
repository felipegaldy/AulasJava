package br.com.generation.testes;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		int resultadoEsperado = 4;
		double resultado = calc.somar(2.8, 2);
		
		if(resultado == resultadoEsperado) {
			System.out.println("OK");
		}
		else {
			System.out.println("Teste falhou");
		}

	}

}
