package model.entity;

public class Fornecedor {
	
	//Atributos do fornecedor
	private String nome;
	private String CNPJ;
    private String logradouro;
    private String contato;
    
    
    //Getters and Setters
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
    
    
    
}
