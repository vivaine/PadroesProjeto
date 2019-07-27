package Builder;

public class CasaSimplesBuilder extends CasaBuilder {

	@Override
	public void buildChao() {
		casa.chao = 2;

	}

	@Override
	public void buildParedes() {
		casa.parede = 10;

	}

	@Override
	public void buildTelhado() {
		casa.telhado = 1;
	}

	@Override
	public void buildPreco() {
		casa.preco = 80000.0;
		
	}

}
