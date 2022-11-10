package personnages.principaux;

public class Humains {

	private String nom;
	private String boissonPrefere ; 
	private int argent;

	public Humains ( String nom, String boissonPrefere, int argent) {
		this.nom = nom;
		this.boissonPrefere = boissonPrefere;
		this.argent = argent;
	}



	public String getNom() {
		return nom;
	}
	public String getBoissonPrefere() {
		return boissonPrefere;
	}
	public int getArgent() {
		return argent;
	}

	public void parler (String parle) {
		System.out.println( "(<" + this.nom + ">)" + " - " + parle);
	}

	public void bonjour () {
		parler("Bonjour ! Je m’appelle " + this.nom + " et j’aime boire du "+ this.boissonPrefere + ".");
	}
	public void boire () {
		parler("Mmmm, un bon verre de" + this.boissonPrefere +"! GLOUPS !");
	}

	public int gain(int x) {
		argent=+x;
		return argent;
	}
	public int perte(int x) {
		argent=-x;
		return argent;
	}


	public static void main(String[] args) {

	}

}
