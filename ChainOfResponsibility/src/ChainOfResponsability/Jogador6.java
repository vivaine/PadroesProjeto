package ChainOfResponsability;

public class Jogador6 extends JogadorChain {
	
	public Jogador6() {
		super(IDJogadores.Jogador6);
	}
	
	@Override
	public void entraJogo() {
		System.out.println("Jogador 6 entrou no jogo");
	}
	
	

}
