package personnages.principaux;

public class Commercants extends Humains {

	public Commercants(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		 return perte(getArgent());
	}
	
	public void recevoir (int argent) {
		gain(argent);
	}
}
