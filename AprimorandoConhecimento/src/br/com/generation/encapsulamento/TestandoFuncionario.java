package br.com.generation.encapsulamento;

public class TestandoFuncionario {
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Serena");
		func.setSalario(9700);
		
		System.out.println(func.getNome() + " tem um salario minimo de " + func.getSalario());
		int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);
	}
}
