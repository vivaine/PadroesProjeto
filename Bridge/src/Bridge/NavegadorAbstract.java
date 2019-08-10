package Bridge;

public abstract class NavegadorAbstract {
	
	protected Website website;
	
	public NavegadorAbstract(Website website) {
		this.website = website;
		website.atualizarPagina();
	}

}
