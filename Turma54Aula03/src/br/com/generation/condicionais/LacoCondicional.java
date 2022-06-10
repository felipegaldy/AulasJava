package br.com.generation.condicionais;

import java.util.Scanner;

public class LacoCondicional {
	//Laços condicionais
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota do aluno: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2)/ 2;
		
		if(media >= 6.0) {
			//aprovado
		}else if (media >= 5.0 && media < 6.0) {
			//recuperação
		}else {
			//reprovado
		}

	}

}
