package Main;

import Proxy.ReceitaProxy;

public class Main {

	public static void main(String[] args) {
		ReceitaProxy receita = new ReceitaProxy();
		
		System.out.println("Resultado do PagouFisico: "+receita.pagarFisico(100, 2, "123456789"));
		System.out.println("Resultado do PagouJuridico: "+receita.pagarJuridico(180, 2, "4357456789"));
	}

}
