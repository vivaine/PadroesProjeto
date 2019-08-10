package Composite;

public abstract class Pessoa {

	String nomePessoa;
	
	public String getNome() {
		return this.nomePessoa;
	}
	
	public void adicionar(Pessoa pessoa) throws Exception {
		throw new Exception("Pessoa não pode ter filhos");
	}
	
	
	public Pessoa getPessoa(String nome) throws Exception {
		throw new Exception("Pessoa não pode pesquisar filhos");
	}
}
