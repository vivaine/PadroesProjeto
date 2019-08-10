package ChainOfResponsability;

public class Jogador2 extends JogadorChain {
	
	public Jogador2() {
		super(IDJogadores.Jogador2);
	}
	
	@Override
	public void entraJogo() {
		System.out.println("Jogador 2 entrou no jogo");
	}
	
	

}
