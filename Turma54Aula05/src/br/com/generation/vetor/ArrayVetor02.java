package br.com.generation.vetor;

import java.util.Random;

public class ArrayVetor02 {
	public static void main(String[] args) {
		double[] temperaturas = new double[31], probabilidadeChuva = new double[31];
		Random random = new Random();
		for(int i=0; i < temperaturas.length; i++) {
			temperaturas[i] = Math.round(Math.random() * 45.0);
			System.out.println("Temperatura: "+ temperaturas[i]);
			probabilidadeChuva[i] = random.nextDouble(100);
			System.out.println("Probabilidade de chuva: "+probabilidadeChuva[i]);
			
		}
	}

}
