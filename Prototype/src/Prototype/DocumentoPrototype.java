package Prototype;

public abstract class DocumentoPrototype {

	protected String tamanhoPagina;
	
	public abstract String exibirInfo();
	
	public abstract DocumentoPrototype clonar();
	
	public String getTamanhoPagina() {
		return tamanhoPagina;
	}
	
	public void setTamanhoPagina(String valor) {
		this.tamanhoPagina = valor;
	}
	
}
