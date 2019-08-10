package Facade;

public class Compra {
	
	private Contabilidade contabilidade;
	private Qualidade qualidade;
	private Logistica logistica;
	private Transportadora transportadora;
	
	public Compra() {
		this.contabilidade = new Contabilidade();
		this.qualidade = new Qualidade();
		this.logistica = new Logistica();
		this.transportadora = new Transportadora();
	}
	
	public void comprar() {
		contabilidade.pagar();
		qualidade.validar();
		logistica.embrulhar();
		transportadora.movimentar();
		transportadora.entregar();
	}

}
