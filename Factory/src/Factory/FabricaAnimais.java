package Factory;
public abstract class FabricaAnimais {
	
	protected Animal animal;
	
	public abstract void criarAnimal(String raca);
		
	
	public Animal getAnimal() {
		return animal;
	}
	

}
