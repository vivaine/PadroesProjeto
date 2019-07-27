package AbstractFactory;

public class PaisAnimalFactoryAfrica extends PaisAnimalFactory {

	@Override
	public Cor retornaCor() {
		// TODO Auto-generated method stub
		return new CorLaranja();
	}

}
