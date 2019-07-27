package Teste;


import AbstractFactory.Cor;
import AbstractFactory.FabricaAnimais;
import AbstractFactory.FabricaAnimaisAquaticos;
import AbstractFactory.FabricaAnimaisTerrestres;

public class Principal {
	
	public static void main(String[] args) {
		FabricaAnimais fabricaTerrestres = new FabricaAnimaisTerrestres();
		fabricaTerrestres.criarAnimal("Brasil", "cachorro");
		String cor = fabricaTerrestres.getAnimal().getCor().getNome();
		Cor corObj = fabricaTerrestres.getAnimal().getCor();
		System.out.println("Cachorro do Brasil é "+cor);
		System.out.println(corObj);
		
		FabricaAnimais fabricaAquaticos = new FabricaAnimaisAquaticos();
		fabricaAquaticos.criarAnimal("Africa", "peixe");
		cor = fabricaAquaticos.getAnimal().getCor().getNome();
		System.out.println("Peixe da África é "+cor);
	}

}
