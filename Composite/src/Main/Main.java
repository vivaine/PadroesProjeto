package Main;

import Composite.Homem;
import Composite.Mulher;
import Composite.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa mae  = new Mulher("Joana");
		Pessoa filha = new Mulher("Carla");
		Pessoa pai = new Homem("Jorge");
		
		try {
			mae.adicionar(filha);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Pessoa resultado;
		
		try {
			resultado = mae.getPessoa("Carla");
			System.out.println(resultado.getNome());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pai.adicionar(filha);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
