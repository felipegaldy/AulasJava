package br.com.generation.classes;

public class TestaAluno {

	public static void main(String[] args) {
		// criando objeto
		//estanciando o aluno na classe aluno - criar um objeto
		Aluno aluno1 = new Aluno(); 
		Aluno aluno2 = new Aluno();
		
		aluno1.nome = "Felipe Silveira";
		aluno1.idade = 28;
		aluno1.curso = "Java";
		
		System.out.println(aluno1.nome);
		System.out.println(aluno1.idade);
		System.out.println(aluno1.curso);
		
		aluno1.assistirAula();
		aluno1.estudar();
		
		aluno2.nome = "Felipe Camilo";
		aluno2.idade = 22;
		aluno2.curso = "Java";
		
		System.out.println(aluno2.nome);
		System.out.println(aluno2.idade);
		System.out.println(aluno2.curso);
		
		aluno2.assistirAula();
		aluno2.estudar();
		
		

	}

}
