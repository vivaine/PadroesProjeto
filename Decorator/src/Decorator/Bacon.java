package Decorator;

public class Bacon extends Ingredientes {
	
	public Bacon(Comida comida) {
		super(comida);
	}

	public void adicionarBacon() {
		System.out.println("Adicionar bacon à comida");
	}	

}
