package br.com.generation.collectionss;

import java.util.ArrayList;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {
		
		Collection<String> lista = new ArrayList<>();
		Collection<String> lista2 = new ArrayList<>();
		lista2.add("joao");
		lista.add("Felipe");//adiciona item a lista
		lista.add("Felipe");
		lista.add("Maria");
		lista2.addAll(lista);
		System.out.println(lista2);
		lista.contains("felipe");//verifica se tem algo na lista
		System.out.println(lista.isEmpty());//verifica se esta vazia e retorna true ou false
		lista.remove("Maria"); // remove item da lista, pode usar indice para remover
		System.out.println(lista);
		lista.removeAll(lista);// remove todos itens da lista
		System.out.println(lista);
		lista.clear();// limpa a lista
		System.out.println(lista);
		
		}

}
