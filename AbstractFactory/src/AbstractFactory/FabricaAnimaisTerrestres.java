package AbstractFactory;

public class FabricaAnimaisTerrestres extends FabricaAnimais{
	
	@Override
	public void criarAnimal(String pais, String raca) {
		
		if (raca == "cachorro") {
			animal = new Cachorro(getCor(pais));
		}
		else if (raca == "gato" ) {
			animal = new Gato(getCor(pais));
		}

	}

}
