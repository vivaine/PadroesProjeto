package AbstractFactory;

public class Animal {

	protected Cor cor;	
	
	public Animal(Cor cor) {
		this.cor = cor;
	}
	
	public Cor getCor() {
		return cor;
	}
	

	
}
