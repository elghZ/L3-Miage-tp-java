package personnages.principaux;


public class Samourai extends Ronnins{

	private String seigneur ;
	
	public Samourai(String nom,int argent, String boissonPrefere,  String seigneur) {
		super(nom,  argent,boissonPrefere);
		this.seigneur = seigneur;
	}
	
	public String getSeigneur() {
		return this.seigneur;
	}
	
	public void boire() {
		super.boire();
	}
	
	public void bonjour(){
		super.parler("Bonjour ! Je m’appelle" + getNom() + "et j’aime boire du"
				+ getBoissonPrefere() + "Mon seigneur est : " + seigneur);
		
	}
	
	
}
