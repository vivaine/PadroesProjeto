package FlyWeight;

public class Cliente {
	
	private ArquivoFactory factory;
	
	public Cliente() {
		factory = new ArquivoFactory();
	}
	
	public String getArquivo(String nome) {
		return factory.localizarArquivo(nome);
	}

}
