package br.com.felipebackend.vetoresmatrizes;

import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		//video java generation
		Scanner in = new Scanner(System.in);
		
		int[] arrayUm = {10, 5, 25, 35, 89, 100};
		int[] arrayDois = {3 , 8 , 5959, 258, 654, 24};
		int[] arrayTres = new int[5];
		
		float[] nota = new float[5];
		
		if(arrayDois.length > 2) {
			System.out.println("Aprendendo sobre vetores!");
		}
		
		
		//for each
		String[] cars = {"Volvo", "","Ford", "BMW"};
		for(String i : cars) {
			System.out.println(i);
		}
		
		

	}

}
