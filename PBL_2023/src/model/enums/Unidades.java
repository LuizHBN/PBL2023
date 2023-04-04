package model.enums;

public enum Unidades {
	
	    UNIDADE("UN", "Unidade"),
	    GRAMA("G", "Grama"),
	    QUILOGRAMA("KG", "Quilograma"),
	    METRO("M", "Metro"),
	    CENTIMETRO("CM", "Centímetro"),
	    LITRO("L","Litro");

	
	    private String sigla;
	    private String descricao;
	    
	    Unidades(String sigla, String descricao) {
	        this.sigla = sigla;
	        this.descricao = descricao;
	    }

	    public String getSigla() {
	        return sigla;
	    }

	    public String getDescricao() {
	        return descricao;
	    }
}
