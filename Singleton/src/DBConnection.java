import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class DBConnection {
	
	private static DBConnection instance;
	private String nome;
	
	private DBConnection() {
		Date hoje =  GregorianCalendar.getInstance().getTime();	
		//long milis = GregorianCalendar.getInstance().getTimeInMillis();
		
		nome = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(hoje);
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public static DBConnection getInstance() {
		if (instance == null) 
				instance = new DBConnection();
		return instance;
	}
	

}
