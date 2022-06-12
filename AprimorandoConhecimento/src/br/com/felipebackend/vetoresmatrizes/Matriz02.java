package br.com.felipebackend.vetoresmatrizes;

import java.util.Scanner;

public class Matriz02 {

	public static void main(String[] args) {
		 
		int[][] matriz = new int[3][3];
		
		Scanner in = new Scanner(System.in);
		System.out.println("Matriz[3][3]");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf(matriz[i][j] + " | ");;
			}
			System.out.println();
		}

	}

}
