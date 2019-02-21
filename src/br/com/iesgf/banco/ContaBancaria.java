package br.com.iesgf.banco;

public class ContaBancaria {

	private String numero;
	
	private double saldo;
	
	private ProprietarioDaConta dono;

	public ContaBancaria(String numero, double saldo, ProprietarioDaConta dono) {
		this.numero = numero;
		this.saldo = saldo;
		this.dono = dono;
	}

	
	
	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	void depositar(double montante) {
		this.saldo += montante;
	}
	
	void sacar(double montante) {
		this.saldo -= montante;
	}
	

}
