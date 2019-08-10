package Composite;

import java.util.ArrayList;

public class Mulher extends Pessoa {
	
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(); 
	
	public Mulher(String nome) {
		this.nomePessoa = nome;
	}
	
	@Override
	public void adicionar(Pessoa pessoa)  {
		this.pessoas.add(pessoa);
	}
	
	@Override
	public Pessoa getPessoa(String nome) throws Exception {
		for (Pessoa pessoaTmp : pessoas) {
			if (pessoaTmp.getNome() == nome) {
				return pessoaTmp;
			}
		}
		throw new Exception("Não existe filho");
	}
	
}
