package br.com.iesgf.banco;

public class ProprietarioDaConta {
	
	private String nomeCompleto;
	
	private String cpf;
	
	private int telefone;
	
	private Banco banco;

	public ProprietarioDaConta() {
		
	}
	
	public ProprietarioDaConta(String nomeCompleto, String cpf, int telefone, Banco banco) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.telefone = telefone;
		this.banco = banco;
	}
	

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public int getTelefone() {
		return telefone;
	}
	
	
	
}
