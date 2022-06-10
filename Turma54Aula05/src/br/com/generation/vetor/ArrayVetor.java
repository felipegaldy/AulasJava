package br.com.generation.vetor;

import java.util.Random;

public class ArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayVetor = new int[10];
		Random gerador = new Random();
		
		for(int i = 0; i < 10; i++) {
			arrayVetor[i] = gerador.nextInt(100);
			System.out.println(arrayVetor[i]);
		}
		
		System.out.println();
		
	}

}
