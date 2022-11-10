package histoires;

public class MonHistoire {

	private String nom;
	private String boissonPrefere ; 
	private int argent;
	
	public MonHistoire ( String nom, String boissonPrefere, int argent) {
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

public void setNom(String nom) {
		this.nom = nom;
	}
	public void setBoissonPrefere(String boissonPrefere) {
		this.boissonPrefere = boissonPrefere;
	}
	public void setArgent(int argent) {
		this.argent = argent;
	}


public String parler (String parle) {
	return "(<" + this.nom + ">)" + " - " + parle;
}

public void bonjour () {
	parler("Bonjour ! Je m’appelle" + this.nom + "et j’aime boire du"+ this.boissonPrefere);
}
public void boire () {
	parler("Mmmm, un bon verre de" + this.boissonPrefere +"! GLOUPS !");
}

public int gain(int x) {
	return getArgent() + x;
}
public int perte(int x) {
	return getArgent() - x;
}


	public static void main(String[] args) {
		
	}

}
