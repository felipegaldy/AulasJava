package br.com.generation.heranca;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa felipe = new Pessoa("Felipe", 7);
		
		Funcionario pedro = new Funcionario("Pedro", 8,"T.I");
		
		Pessoa maria = new Funcionario("Maria", 9, "Tecnologia");
		
		Coordenador jose = new Coordenador("Jose", 10, "Gestão");
		
		System.out.println(felipe.getNome());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getCursoCoordenador());
	}

}
