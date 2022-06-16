package br.com.generation.polimorfismo;

public class Pessoa1 {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome: " + nome;
	}
	
	
	
}
