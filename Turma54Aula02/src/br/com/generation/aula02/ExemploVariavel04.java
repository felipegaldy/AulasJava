package br.com.generation.aula02;

import java.util.Scanner;

public class ExemploVariavel04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double a, b, soma, multiplica, divisao;
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		b = leia.nextDouble();
		
		soma = a + b;
		multiplica = a * b;
		divisao = a / b;
		double subtrair = a - b;
		System.out.println("A soma entre a e b é igual: "+ soma);
		System.out.println("A subtrair entre a e b é igual: "+ subtrair);
		System.out.println("A divisao entre a e b é igual: "+ divisao);
		System.out.println("A multiplica entre a e b é igual: "+ multiplica);
		
	}

}
