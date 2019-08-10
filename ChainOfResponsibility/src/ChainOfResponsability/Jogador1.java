package ChainOfResponsability;

public class Jogador1 extends JogadorChain {
	
	public Jogador1() {
		super(IDJogadores.Jogador1);
	}
	
	@Override
	public void entraJogo() {
		System.out.println("Jogador 1 entrou no jogo");
	}
	
	

}
