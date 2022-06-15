package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoEstoque {

	public static void main(String[] args) {
		System.out.println("INICIANDO PROGRAMA....");
		
		ArrayList<Estoque> listaProdutos = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		
		System.out.println("DIGITE O NOME DO PRODUTO:");
		in.nextLine();
		String nome = in.nextLine();
		System.out.println("DIGITE O PREÇO DO PRODUTO:");
		int preco = in.nextInt();
		System.out.println("DIGITE O QUANTIDADE DO PRODUTO:");
		int quantidade = in.nextInt();
		
		
		//adicionando
		listaProdutos.add(new Estoque(nome, preco, quantidade));
		listaProdutos.add(new Estoque("Produto 1", 50,50));
		System.out.println(listaProdutos);
		//removendo
		listaProdutos.remove(0);
		System.out.println(listaProdutos);
		//atualizando
		
		listaProdutos.set(0, new Estoque("Novo Produto", 200, 20));
		System.out.println(listaProdutos);
		//apresentando
		for(Estoque i: listaProdutos) {
			System.out.println(i);
		}
		
		
	}

}
