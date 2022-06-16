package br.com.generation.interfacee;

public class TesteInterfacee {

	public static void main(String[] args) {
	
		ParticipanteForum pessoa = new ParticipanteForum();
		Leitor leitor = pessoa;
		System.out.println(leitor.lendo());
	}

}
