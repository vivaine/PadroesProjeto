package Main;

import ChainOfResponsability.IDJogadores;
import ChainOfResponsability.Jogador1;
import ChainOfResponsability.Jogador2;
import ChainOfResponsability.Jogador3;
import ChainOfResponsability.Jogador4;
import ChainOfResponsability.Jogador5;
import ChainOfResponsability.Jogador6;
import ChainOfResponsability.JogadorChain;

public class Main {
	
	public static void main(String[] args) {
		JogadorChain jogadores = new Jogador1();
		jogadores.setNext(new Jogador2());
		jogadores.setNext(new Jogador3());
		jogadores.setNext(new Jogador4());
		jogadores.setNext(new Jogador5());
		jogadores.setNext(new Jogador6());
		
		try {
			jogadores.entrarNoJogo(IDJogadores.Jogador2);
			jogadores.entrarNoJogo(IDJogadores.Jogador3);
			jogadores.entrarNoJogo(IDJogadores.Jogador1);
			jogadores.entrarNoJogo(IDJogadores.Jogador4);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
