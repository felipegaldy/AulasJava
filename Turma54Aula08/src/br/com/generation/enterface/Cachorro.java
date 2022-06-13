package br.com.generation.enterface;

public class Cachorro implements Animal {

	@Override // sobrescrita de metodo
	public void somAnimal() {
		System.out.println("Au Au Au");
		
	}

	@Override
	public void dormir() {
		
		System.out.println("auau dormindo");
		
	}

}
