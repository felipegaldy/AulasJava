package br.com.generation.collectionss;

import java.util.HashSet;
import java.util.Set;

public class Colecoes2 {

	public static void main(String[] args) {
		 
		Set<Aluno> lista = new HashSet<Aluno>();
		
		Aluno a = new Aluno("Felipe", "QA", 10);
		Aluno b = new Aluno("Felipe Silveira", "JAVA", 10);
		Aluno c = new Aluno("Nayara Silveira", "frontend", 10);
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		
		System.out.println(lista);

	}

}
