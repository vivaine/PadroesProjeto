package ChainOfResponsability;

public abstract class JogadorChain {
	
	protected IDJogadores idJogador;
	protected JogadorChain next;
	
	public JogadorChain(IDJogadores id) {
		next = null;
		this.idJogador = id;
	}
	
	public void setNext(JogadorChain jogador) {
		if (next == null) {
			next = jogador;
		} else {
			next.setNext(jogador);
		}
	}
	
	public void entrarNoJogo(IDJogadores id) {
		entraJogo();
	}
	
	public abstract void entraJogo();
	
}
