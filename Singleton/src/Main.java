
public class Main {

	public static void main(String[] args) {
		
		String conexao1;
		String conexao2;
		
		conexao1 = DBConnection.getInstance().getNome();
		conexao2 = DBConnection.getInstance().getNome();
		
		System.out.println("conexão 1 = " + conexao1);
		//new Thread();
		//Thread.sleep(2000);
		System.out.println("conexão 2 = " + conexao2);
	}

}
