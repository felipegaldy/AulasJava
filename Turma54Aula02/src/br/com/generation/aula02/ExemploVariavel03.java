package br.com.generation.aula02;

import java.util.Scanner;

public class ExemploVariavel03 {

	public static void main(String[] args) {
		
		double galoes, litros;
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a quantidade de gal�es: ");
		galoes = leia.nextDouble();
		litros = galoes * 3.7854;
		
		System.out.println(galoes + " gal�es americanos s�o: " + litros + " litros.");
	}

}
