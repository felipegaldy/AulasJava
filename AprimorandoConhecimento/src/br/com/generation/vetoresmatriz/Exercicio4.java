package br.com.generation.vetoresmatriz;

import java.util.Scanner;

/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */

public class Exercicio4 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int soma=0, somaDiagonal=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int linha=0; linha < matriz.length; linha++) {
			for(int coluna=0; coluna < matriz[linha].length; coluna++) {
				System.out.println("Digite um numero:");
				matriz[linha][coluna] = entrada.nextInt();
				soma = matriz[linha][coluna] + soma;
				if(linha == coluna) {
					somaDiagonal = matriz[linha][coluna] + somaDiagonal;
				}
			}
		}
		
		for(int linha=0; linha < matriz.length; linha++) {
			for(int coluna=0; coluna < matriz[linha].length; coluna++) {
				System.out.printf(matriz[linha][coluna]+" | ");
			}
			System.out.println();
		}
		
		System.out.println("A soma de todos valores: " + soma);
		System.out.println("A soma diagonal: "+ somaDiagonal);

	}

}
