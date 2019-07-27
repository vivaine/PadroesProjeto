package AbstractFactory;

public class PaisAnimalFactoryBrasil extends PaisAnimalFactory {

	@Override
	public Cor retornaCor() {
		return new CorVerde();
	}

}
