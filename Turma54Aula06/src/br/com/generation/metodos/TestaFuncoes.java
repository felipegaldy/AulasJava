package br.com.generation.metodos;

import java.util.Scanner;

public class TestaFuncoes {
	
	static int num3, num4, multiplica;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Digite o valor do num3:");
		num3 = new Scanner(System.in).nextInt();
		System.out.println("Digite o valor do num4:");
		num4 = new Scanner(System.in).nextInt();

		System.out.println("Olá osu o metodo, principal");
		metodo01();
		metodo03();
		metodo04();
		
		TestaMetodoFora.metodo05();
		metodo06(25, num4);
		
	}
	
	public static void metodo01() {
		System.out.println("Sou o segundo metodo e vou chamar o metodo02");
		metodo02(10);
	}
	
	public static void metodo02(int num10) {
		//no metodo as variaveis so existem dentro dele
		double soma, num1=10, num2=10;
		soma = num1 + num2 + num10;
		System.out.println("A soma realizada no metodo02: "+ soma);
		System.out.println("Vou chamar o metodo01");
		
	}
	
	public static void metodo03() {
		multiplica = num3 * num4;
		
	}
	
	public static void metodo04() {
		System.out.println("Sou o metodo 04 e vou chamar o metodo03 e seus calculos " + multiplica);
	}
	
	public static void metodo06(int num5, int num6) {
		int subtracao;
		subtracao = num5 - num6;
		System.out.println("Subtracao do meto06: "+ subtracao);
	}

}
