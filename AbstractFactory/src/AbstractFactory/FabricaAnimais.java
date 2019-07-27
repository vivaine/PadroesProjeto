package AbstractFactory;
public abstract class FabricaAnimais {
	
	protected Animal animal;
	
	public abstract void criarAnimal(String pais, String raca);
		
	
	public Animal getAnimal() {
		return animal;
	}
	
	public Cor getCor(String pais) {
		if (pais.equals("Brasil")) {
			return new PaisAnimalFactoryBrasil().retornaCor() ;
		}
		return new PaisAnimalFactoryAfrica().retornaCor();

	}
	

}
