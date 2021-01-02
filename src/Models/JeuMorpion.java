package Models;

public class JeuMorpion {
	private String joueur1;
	private String joueur2;
	private String[] grille = { null, null, null, null, null, null, null, null, null };

	private String trait; // le trait est le terme utilisé pour définir le joueur qui commence son tour.
							// C'est un terme utilisé aux échecs
	private int nbrCoup;

	public JeuMorpion(String joueur1, String joueur2) {

		this.joueur1 = joueur1;
		this.joueur2 = joueur2;

		this.trait = joueur1;
	}

	public JeuMorpion(String joueur1, String joueur2, String trait) {
		super();
		this.joueur1 = joueur1;
		this.joueur2 = joueur2;

		this.trait = trait;
	}

	public void resetGrille() {
		for (int i = 0; i < 9; i++) {
			grille[i] = null;
		}
	}

	public void resetNbrCoup() {
		nbrCoup = 0;
	}

	public String checkWinner() {

		/**
		 * Verifie si quelqu'un à gagner, si oui il returne le nom du joueur, sinon il
		 * retourne null
		 */
		if (grille[0] == joueur1 && grille[1] == joueur1 && grille[2] == joueur1) {
			return joueur1;
		}
		if (grille[3] == joueur1 && grille[4] == joueur1 && grille[5] == joueur1) {
			return joueur1;
		}
		if (grille[6] == joueur1 && grille[7] == joueur1 && grille[8] == joueur1) {
			return joueur1;
		}

		if (grille[0] == joueur1 && grille[3] == joueur1 && grille[6] == joueur1) {
			return joueur1;
		}
		if (grille[1] == joueur1 && grille[4] == joueur1 && grille[7] == joueur1) {
			return joueur1;
		}
		if (grille[2] == joueur1 && grille[5] == joueur1 && grille[8] == joueur1) {
			return joueur1;
		}

		if (grille[0] == joueur1 && grille[4] == joueur1 && grille[8] == joueur1) {
			return joueur1;
		}
		if (grille[2] == joueur1 && grille[4] == joueur1 && grille[6] == joueur1) {
			return joueur1;
		}

		if (grille[0] == joueur2 && grille[1] == joueur2 && grille[2] == joueur2) {
			return joueur2;
		}
		if (grille[3] == joueur2 && grille[4] == joueur2 && grille[5] == joueur2) {
			return joueur2;
		}
		if (grille[6] == joueur2 && grille[7] == joueur2 && grille[8] == joueur2) {
			return joueur2;
		}

		if (grille[0] == joueur2 && grille[3] == joueur2 && grille[6] == joueur2) {
			return joueur2;
		}
		if (grille[1] == joueur2 && grille[4] == joueur2 && grille[7] == joueur2) {
			return joueur2;
		}
		if (grille[2] == joueur2 && grille[5] == joueur2 && grille[8] == joueur2) {
			return joueur2;
		}

		if (grille[0] == joueur2 && grille[4] == joueur2 && grille[8] == joueur2) {
			return joueur2;
		}
		if (grille[2] == joueur2 && grille[4] == joueur2 && grille[6] == joueur2) {
			return joueur2;
		}

		return null;
	}

	public String insert(int position, String trait) {
		if (0 <= position && position <= 8 && grille[position] == null) {
			setNbrCoup(getNbrCoup() + 1);
			grille[position] = this.trait;
			/**
			 * Return null si pas de gagnant sinon retourne le nom du gagnant
			 */
			String result = this.checkWinner();

			/**
			 * Si "checkwinner" ne donne pas null et donc qu'il y'a un gagant, retourne le
			 * nom du gagnant
			 */
			if (result != null) {
				/**
				 * Retourne le nom du gagnant
				 */
				return result;

				/**
				 * Si il retourne aucun gagnant et qu'il n'y as plus de coups possible, retourne
				 * "nobody"
				 */
			} else if (getNbrCoup() == 9) {
				return "nobody";
			}

		}
		return null;
	}

	public void changeTrait() {
		/**
		 * Si c'est au tour du joueur1, changer en joueur2 et inversement
		 */
		String n1 = joueur1;
		if (getTrait() == joueur1) {
			setTrait(joueur2);
		} else {
			setTrait(joueur1);
		}

	}

	public String getJoueur1() {
		return joueur1;
	}

	public void setJoueur1(String joueur1) {
		this.joueur1 = joueur1;
	}

	public String getJoueur2() {
		return joueur2;
	}

	public void setJoueur2(String joueur2) {
		this.joueur2 = joueur2;
	}

	public String getGrille() {
		String str = "";
		for (int i = 0; i < 9; i++) {
			str += grille[i] + " ";
		}
		return str;
	}

	public void setGrille(String[] grille) {
		this.grille = grille;
	}

	public String getTrait() {
		return trait;
	}

	public void setTrait(String trait) {
		this.trait = trait;
	}

	public int getNbrCoup() {
		return nbrCoup;
	}

	public void setNbrCoup(int nbrCoup) {
		this.nbrCoup = nbrCoup;
	}

}
