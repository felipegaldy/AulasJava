package br.com.generation.vetor;

import java.util.Random;
import java.util.Scanner;

public class Matriz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double[][] notasAlunos = new double[2][4];
		Random notas = new Random();
		System.out.println("=======Notas dos Alunos=======");
		
		for(int i = 0; i < notasAlunos.length; i++) {
			for(int j=0; j < notasAlunos[i].length; j++) {
				notasAlunos[i][j] = notas.nextInt(10);
				
			}
		}
		for(int i = 0; i < notasAlunos.length; i++) {
			for(int j=0; j < notasAlunos[i].length; j++) {
				System.out.printf(notasAlunos[i][j] + " | ");
			}
			System.out.println();
		}
		
		
	}

}
