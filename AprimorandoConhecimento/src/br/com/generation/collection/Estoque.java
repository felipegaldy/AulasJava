package br.com.generation.collection;
/*
 * Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	programa deverá atender as seguintes funcionalidades:
	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.
 */

public class Estoque {
	
	private String nome;
	private int preco;
	private int quantidade;
	
	public Estoque(String nome, int preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " | Preco: " + preco + " | Quantidade: " + quantidade;
	}
	
	
	
	
}
