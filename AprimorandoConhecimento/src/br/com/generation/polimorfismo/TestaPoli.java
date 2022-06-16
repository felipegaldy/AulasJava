package br.com.generation.polimorfismo;

public class TestaPoli {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNome("Nayara");
		pf.setCpf(1548358531);
		
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setNome("maresia");
		pj.setCnpj(01470254001);
		
		Pessoa1[] p = new Pessoa1[2];
		p[0] = pf;
		p[1] = pj;
		
		for(Pessoa1 i: p) {
			System.out.println(i.getNome());
		}
		
		
		
	}

}
