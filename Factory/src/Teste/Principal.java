package Teste;

import Factory.FabricaAnimais;
import Factory.FabricaAnimaisTerrestres;
import Factory.FabricaAnimaisAquaticos;

public class Principal {
	
	public static void main(String[] args) {
		FabricaAnimais fabricaTerrestres = new FabricaAnimaisTerrestres();
		fabricaTerrestres.criarAnimal("cachorro");
		
		FabricaAnimais fabricaAquaticos = new FabricaAnimaisAquaticos();
		fabricaAquaticos.criarAnimal("peixe");
	}

}
