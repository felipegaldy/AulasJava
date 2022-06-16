package br.com.generation.collectionss;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String[] args) {
		Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
		
		Aluno a = new Aluno("Felipe", "QA", 10);
		Aluno b = new Aluno("Felipe Silveira", "JAVA", 10);
		Aluno c = new Aluno("Nayara Silveira", "frontend", 10);
		
		mapa.put("Felipe", a);
		mapa.put("Felipe Silveira", b);
		mapa.put("Nayara Silveira", c);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Felipe"));
		
		Collection<Aluno> aluno = mapa.values();
		for(Aluno i: aluno) {
			System.out.println(i);
		}
		
	}
}
