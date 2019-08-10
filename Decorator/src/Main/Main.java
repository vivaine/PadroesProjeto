package Main;

import Decorator.Bacon;
import Decorator.Burger;
import Decorator.Macarrao;
import Decorator.Pizza;
import Decorator.Queijo;

public class Main {

	public static void main(String[] args) {
		Burger hamburger = new Burger();
		Queijo queijoBurger = new Queijo(hamburger);
		
		hamburger.adicionarPao();
		queijoBurger.adicionarQueijo();
		
		Pizza pizza = new Pizza();
		Queijo queijoPizza = new Queijo(pizza);
		queijoPizza.adicionarQueijo();
		Bacon baconPizza = new Bacon(pizza);
		baconPizza.adicionarBacon();
		
		Macarrao macarrao = new Macarrao();
		Queijo queijoMacarrao = new Queijo(macarrao);
		queijoMacarrao.adicionarQueijo();

	}

}
