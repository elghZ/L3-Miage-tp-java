package personnages.principaux;

public class Commercants extends Humains {

	public Commercants(String nom, String boissonPrefere, int argent) {
		super(nom, boissonPrefere, argent);
		boissonPrefere = "thé";	
	}

	public int seFaireExtorquer() {
		 return perte(getArgent());
	}
	
	public void recevoir (int argent) {
		gain(argent);
	}
}
