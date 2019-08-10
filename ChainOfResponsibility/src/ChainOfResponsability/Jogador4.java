package ChainOfResponsability;

public class Jogador4 extends JogadorChain {
	
	public Jogador4() {
		super(IDJogadores.Jogador4);
	}
	
	@Override
	public void entraJogo() {
		System.out.println("Jogador 4 entrou no jogo");
	}
	
	

}
