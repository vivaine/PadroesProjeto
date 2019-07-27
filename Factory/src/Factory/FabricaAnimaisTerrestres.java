package Factory;

public class FabricaAnimaisTerrestres extends FabricaAnimais{
	
	@Override
	public void criarAnimal(String raca) {
		
		if (raca == "cachorro") {
			animal = new Cachorro();
		}
		else if (raca == "gato" ) {
			animal = new Gato();
		}

	}

}
