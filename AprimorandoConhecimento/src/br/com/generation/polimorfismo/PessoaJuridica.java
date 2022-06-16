package br.com.generation.polimorfismo;

public class PessoaJuridica extends Pessoa1 {
	private long cnpj;
	
	

	public PessoaJuridica() {

	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return "pj "+ super.getNome()+" cnpj " + this.getCnpj();	 
	}
	
}
