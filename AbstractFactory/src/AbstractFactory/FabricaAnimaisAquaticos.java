package AbstractFactory;

public class FabricaAnimaisAquaticos extends FabricaAnimais {

	@Override
	public void criarAnimal(String pais, String raca) {
		if (raca == "peixe") {
			animal = new Peixe(getCor(pais));
		}

	}

}
