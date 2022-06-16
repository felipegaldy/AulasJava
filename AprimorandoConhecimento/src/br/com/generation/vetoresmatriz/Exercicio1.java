package br.com.generation.vetoresmatriz;

import java.util.Scanner;

/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */

public class Exercicio1 {

	public static void main(String[] args) {
		
		double[] vetor = new double[5];
		double maior=0;
		
		Scanner entrada = new Scanner(System.in);
		//recebe
		for(int i=0; i < vetor.length; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = entrada.nextDouble();
			
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		
		//mostra
		for(int i=0; i < vetor.length; i++) {
			System.out.println(vetor[i]);		
		}
		
		System.out.println("O maior numero foi o "+ maior);
		
	}

}
