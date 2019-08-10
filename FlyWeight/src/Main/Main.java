package Main;

import FlyWeight.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		System.out.println(cliente.getArquivo("Arquivo 1"));
		System.out.println(cliente.getArquivo("Arquivo 2"));
		System.out.println(cliente.getArquivo("Arquivo 3"));
	}

}
