package br.com.generation.projetoblocoi;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//inicio
		System.out.println("===Inicio do programa===");
		Scanner in = new Scanner(System.in);
		
		int resposta1, idade;
		
		System.out.println("Voc� tem interesse na carreira Tech?");
		System.out.println("Digite 1 para sim e 2 para n�o.");
		System.out.println("1 - Sim | 2 - N�o");
		resposta1 = in.nextInt();
		if(resposta1 == 1) {
			//classe com outras perguntas
			System.out.println("Qual sua idade? ");
			idade = in.nextInt();
			if(idade >= 6 && idade <= 12) {
				//categoria-infantil
			}
			if(idade > 12 && idade <= 17) {
				//teens
			}
			if(idade > 17 && idade <= 100) {
				//adultos
			}
			
		}else {
			//mensagem de incentivo ou despedida
		}

	}

}
