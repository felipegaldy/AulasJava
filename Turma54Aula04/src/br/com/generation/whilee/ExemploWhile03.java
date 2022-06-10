package br.com.generation.whilee;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploWhile03 {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner in = new Scanner(System.in);
		
		int numero = -1;
		
		while(numero != 10) {
			System.out.println("Digite um número: ");
			numero = in.nextInt();

			}
		}
	}

