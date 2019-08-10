package Decorator;

public class Queijo extends Ingredientes {
	
	public Queijo(Comida comida) {
		super(comida);
	}

	public void adicionarQueijo() {
		System.out.println("Adicionar queijo à comida");
		
	}

}
