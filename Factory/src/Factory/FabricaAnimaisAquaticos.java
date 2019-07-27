package Factory;

public class FabricaAnimaisAquaticos extends FabricaAnimais {

	@Override
	public void criarAnimal(String raca) {
		if (raca == "peixe") {
			animal = new Peixe();
		}

	}

}
