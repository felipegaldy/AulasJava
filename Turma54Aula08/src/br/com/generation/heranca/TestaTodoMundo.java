package br.com.generation.heranca;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		Professor prof1 = new Professor();// construtor de classe, abre espaço em memoria para criação de objeto

		
		prof1.setNome("Felipe Silveira");
		prof1.setIdade(33);
		prof1.setEndereco("São Paulo ou Nordeste");
		
		prof1.setSalario(10000.00);
		prof1.setDisciplina("Matemática");
		
		System.out.println(prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getEndereco());
		System.out.println(prof1.getDisciplina());
		System.out.println(prof1.getSalario());
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Felipe Silveira");
		aluno1.setIdade(28);
		aluno1.setEndereco("Francisco Morato");
		aluno1.setSemestre("Quarto");
		aluno1.setCurso("Tecnologia da Informação");
		System.out.println("=====Aluno=====");
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getIdade());
		System.out.println(aluno1.getEndereco());
		System.out.println(aluno1.getSemestre());
		System.out.println(aluno1.getCurso());
		
	}

}
