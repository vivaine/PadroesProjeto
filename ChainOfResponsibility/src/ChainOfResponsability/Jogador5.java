package ChainOfResponsability;

public class Jogador5 extends JogadorChain {
	
	public Jogador5() {
		super(IDJogadores.Jogador5);
	}
	
	@Override
	public void entraJogo() {
		System.out.println("Jogador 5 entrou no jogo");
	}
	
	

}
