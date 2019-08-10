package Decorator;

public class Ingredientes extends Comida {
	
	protected Comida comida;
	
	public Ingredientes(Comida comida) {
		this.comida = comida;
	}

	@Override
	public void preparar() {
		// TODO Auto-generated method stub
	}

}
