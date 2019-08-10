package FlyWeight;

public class Arquivo {
	
	private String nome;
	private String localizacao;
	
	public Arquivo(String nome, String localizacao) {
		this.nome = nome;
		this.localizacao = localizacao;
	}
	
	public String getLocalizacao() {
		return this.localizacao;
	}

	public String getNome() {
		return this.nome;
	}
}
