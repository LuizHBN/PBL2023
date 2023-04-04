package model.entity;

import model.enums.TipoCliente;


public class Cliente {

	
	//Atributos do cliente
	private String nome;
	private String CNPJ;
	private String CPF;
	private String logradouro;
	private String contato;
	
	
	private TipoCliente tipoCliente;


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCNPJ() {
		return CNPJ;
	}


	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getContato() {
		return contato;
	}


	public void setContato(String contato) {
		this.contato = contato;
	}


	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}


	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	
	
}
