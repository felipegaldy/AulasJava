package br.com.generation.orientacaoobjetos;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente pessoa1 = new Cliente("Andreia", 27, "SP");
		
		System.out.println(pessoa1.getNome());
		
		pessoa1.comprar();
		pessoa1.pedirDesconto();
		
	}

}
