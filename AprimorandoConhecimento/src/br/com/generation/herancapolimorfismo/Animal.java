package br.com.generation.herancapolimorfismo;

/*
 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
	caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe
	Animal:
 */

public class Animal {
	
	private String nome;
	private int idade;
	private String emitirSom;
	
	
	public String som(String som) {
		return "o som do animal � "+som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}	

}
