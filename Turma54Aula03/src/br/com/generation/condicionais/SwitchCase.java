package br.com.generation.condicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//escolha caso
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva uma letra: ");
		char letra = entrada.next().charAt(0);
		
		switch(letra) {
		case 'a', 'A', 'b':
			System.out.println("voc� digitou a letra a");
			break;
			default:
				System.out.println("op��o invalida!");
				break;
		}

	}

}
