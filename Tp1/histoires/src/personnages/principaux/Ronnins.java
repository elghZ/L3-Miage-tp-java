package personnages.principaux;


public class Ronnins extends Humains {

	private int honneur;
	
	public Ronnins(String nom, int argent, String boissonPrefere) {
		super(nom, boissonPrefere, argent);	
		this.honneur = 1;
	}
	
	public void donner(int n, Commercants commerçant) {
		perte(n);
		commerçant.recevoir(n);
		
	}
	
	public void provoquer(Yakuzas yaya) {
		if(this.honneur*2 > yaya.getReput()) {
			int n = yaya.perdre();
			this.gain(n);
			parler("J'ai gagné");
			return;
		}
		this.honneur--;
		this.parler("J'ai perdu");
	}
	
	
	
}
