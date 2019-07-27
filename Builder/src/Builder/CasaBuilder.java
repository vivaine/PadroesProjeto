package Builder;

public abstract class CasaBuilder {
	
	protected Casa casa;
	
	public CasaBuilder() {
		casa = new Casa();
	}
	
	public abstract void buildChao();
	
	public abstract void buildParedes();
	
	public abstract void buildTelhado();
	
	public abstract void buildPreco();
	
	public Casa getCasa() {
		return casa;
	}

}
