package br.com.generation.construtor;

public class Pessoa {
	
	String nome;
	int idade;
	
	Pessoa(String n, int i){
		System.out.println("Contruindo pessoa");
		nome = n;
		idade = i;
	}
}
