package ChainOfResponsability;

public class Jogador3 extends JogadorChain {
	
	public Jogador3() {
		super(IDJogadores.Jogador3);
	}
	
	@Override
	public void entraJogo() {
		System.out.println("Jogador 3 entrou no jogo");
	}
	
	

}
