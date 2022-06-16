package br.com.generation.collection;

import java.util.ArrayList;

public class TestaEstoque {

	public static void main(String[] args) {
		
		ArrayList<Estoque> listaEstoque = new ArrayList<>();
		
		// armazenar dados
		Estoque produto1 = new Estoque("CARRO 0 KM", 13000, 8);
		Estoque produto2 = new Estoque("Celula Iphone 13", 13000, 8);
		
		listaEstoque.add(produto1);
		listaEstoque.add(produto2);
		
		
		//remover dados
		//listaEstoque.remove(1);
		//System.out.println(listaEstoque);
		
		//atualizar dados
		listaEstoque.set(0, new Estoque("Café com leite e pao na chapa", 4, 2));
		System.out.println(listaEstoque);
		
		//apresentar dados
		for(Estoque i: listaEstoque) {
			System.out.println(i);
		}
		
	}

}
