package histoires;

import personnages.principaux.*;

public class MonHistoire {

	public static void main(String [] args) {
		Humains humain = new Humains("Prof", "Porto", 10);
		humain.bonjour();
		System.out.println("yyyy");

		humain.boire();

		Commercants commercant = new Commercants("Marchand", 35);
		commercant.bonjour();
		Yakuzas yakusa = new Yakuzas("Yaku␣le␣noir", 42,
				"biere", "WarSong");
		yakusa.bonjour();
		yakusa.extorquer(commercant);
		Ronnins ronin = new Ronnins("Roro", 61, "sake");
		ronin.donner(10, commercant );
		ronin.provoquer(yakusa);
		ronin.bonjour();
	}

}
