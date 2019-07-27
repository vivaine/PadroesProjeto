package Prototype;

public class PdfPrototype extends DocumentoPrototype {

	protected PdfPrototype(PdfPrototype pdfPrototype) {
		this.tamanhoPagina = pdfPrototype.getTamanhoPagina();
	}
	
	@Override
	public String exibirInfo() {
		// TODO Auto-generated method stub
		return "Documento: tamanho p�gina = "+getTamanhoPagina();
	}

	@Override
	public DocumentoPrototype clonar() {
		// TODO Auto-generated method stub
		return new PdfPrototype(this);
	}

}
