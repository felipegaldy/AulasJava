package br.com.generation.encapsulamento;

import java.util.Scanner;

public class TestaVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Veiculo carro = new Veiculo();
		
		System.out.println("Qual a cor? ");
		carro.setCor(in.next());
		System.out.println("Qual a ano? ");
		carro.setAno(in.nextInt());
		System.out.println("Qual a marca? ");
		carro.setMarca(in.next());
		System.out.println("Qual o modelo? ");
		carro.setModelo(in.next());
		
		System.out.println(carro.getCor());
		System.out.println(carro.getAno());
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
	}
}
