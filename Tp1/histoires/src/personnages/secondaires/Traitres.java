package personnages.secondaires;

import personnages.principaux.Commercants;
import personnages.principaux.Samourai;

public class Traitres extends Samourai{
	
	private int traitrise;
	
	public Traitres(String nom,int argent, String boissonPrefere,  String seigneur) {
		super(nom,argent,boissonPrefere, seigneur);
		this.traitrise = 0;
	}
	
	public int getTraitrise() {
		return this.traitrise;
	}
	
	public void extorquer(Commercants c) {
		if(this.traitrise < 3) {
		this.traitrise++;
		this.gain(c.getArgent());
		c.seFaireExtorquer();
		}
		this.parler("oh shit je suis trop une chienne");
		}
	
	
}
