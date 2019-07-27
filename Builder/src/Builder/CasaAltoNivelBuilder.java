package Builder;

public class CasaAltoNivelBuilder extends CasaBuilder {

	@Override
	public void buildChao() {
		casa.chao = 1;

	}

	@Override
	public void buildParedes() {
		casa.parede = 20;

	}

	@Override
	public void buildTelhado() {
		casa.telhado = 2;

	}

	@Override
	public void buildPreco() {
		casa.preco = 1000000;
		
	}

}
