package Builder;

public class Construtora {
	
	protected CasaBuilder tipoCasa;
	
	public Construtora(CasaBuilder tipoCasa) {
		this.tipoCasa = tipoCasa;
	}

	public void construirCasa() {
		tipoCasa.buildChao();
		tipoCasa.buildParedes();
		tipoCasa.buildTelhado();
		tipoCasa.buildPreco();
	}
	
	public Casa getCasa() {
		return tipoCasa.getCasa();
	}
	
}
