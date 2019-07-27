package Prototype;

public class DocPrototype extends DocumentoPrototype {
	
	protected DocPrototype(DocPrototype docPrototype) {
		this.tamanhoPagina = docPrototype.getTamanhoPagina();
	}
	
	public DocPrototype() {
		this.tamanhoPagina = "";
	}

	@Override
	public DocumentoPrototype clonar() {
		// TODO Auto-generated method stub
		return new DocPrototype(this);
	}

	@Override
	public String exibirInfo() {
		// TODO Auto-generated method stub
		return "Documento: tamanho página = "+getTamanhoPagina();
	}

}
