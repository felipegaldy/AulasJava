package br.com.generation.sextou;

public class Automovel {
	
	//atributos da classe automovel
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	private boolean licenciado; 
	
	//criar um metodo especial construtor;
	
	public Automovel(String nomeProprietario, String modelo, String placa, int ano, boolean licenciado) {
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.licenciado = licenciado;
	}
	
	//imprimindo info
	
	public void imprimirInfo() {
		System.out.println("\n"+nomeProprietario+" possui um "+ modelo +" com placa "+ placa +" ano "+ano+" licenciamento "+ licenciado);
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isLicenciado() {
		return licenciado;
	}

	public void setLicenciado(boolean licenciado) {
		this.licenciado = licenciado;
	}
	
	
}
