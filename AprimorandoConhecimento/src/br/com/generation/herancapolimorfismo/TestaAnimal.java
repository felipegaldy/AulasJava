package br.com.generation.herancapolimorfismo;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro bobby = new Cachorro();
		
		bobby.setNome("bobby");
		bobby.setIdade(4);
		bobby.setEmitirSom("AU AU AU");
		
		System.out.println(bobby.som("AU AU AU"));
		

	}

}
