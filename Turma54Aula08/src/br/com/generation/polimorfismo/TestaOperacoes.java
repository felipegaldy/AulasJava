package br.com.generation.polimorfismo;

public class TestaOperacoes {
	
	public static void calculaOperacao(OperacaoMatematica op, double x, double y) {
		System.out.println(op.calcular(x, y));
	}

	public static void main(String[] args) {
		
		calculaOperacao(new Soma(), 235, 5899);
		calculaOperacao(new Multiplica(), 258, 458);
		calculaOperacao(new Dividi(), 235, 5899);
		calculaOperacao(new Subtrai(), 235, 5899);

	}

}
