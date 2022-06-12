package br.com.generation.metodos;

public class MetodoSobreCarga {
	public void TestaMetodos()
	{
		System.out.printf("Salário em npumero inteiro: %d \n", salario(1000));
		System.out.printf("Salário em npumero inteiro: %f \n", salario(7.500));
	}
	
	public int salario(int valorInt) {
		System.out.printf("Salário em npumero inteiro: %d \n", valorInt);
		return valorInt * valorInt;
	}
	
	public double salario(double valorDouble) {
		System.out.printf("Salário em npumero inteiro: %f \n", valorDouble);
		return valorDouble * valorDouble;
	}
}
