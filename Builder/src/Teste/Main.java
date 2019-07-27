package Teste;

import Builder.Casa;
import Builder.CasaAltoNivelBuilder;
import Builder.CasaSimplesBuilder;
import Builder.Construtora;

public class Main {
	
	public static void main(String[] args) {
		
		Construtora construtora = new Construtora(new CasaSimplesBuilder());
		construtora.construirCasa();
		Casa casa = construtora.getCasa();
		System.out.println(casa.getPreco());
		
		construtora = new Construtora(new CasaAltoNivelBuilder());
		construtora.construirCasa();
		casa = construtora.getCasa();
		System.out.println(casa);
		
		
		
		
	}

}
