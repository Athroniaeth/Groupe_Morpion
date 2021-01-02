package Models;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Resultat {

	private String joueur1, joueur2, resultat, date;
	private int id;
	private static int idCount = 0;

	public Resultat() {
		this.id = idCount++;
	}

	public Resultat(String j1, String j2, String r) {
		super();
		this.id = idCount++; // permet d'auto incrément un id dans une optique d'amélioration, d'évolution
		this.joueur1 = j1;
		this.joueur2 = j2;
		this.resultat = r;
		this.date = dateDuJour(); // permet de donner automatiquement une date a chaque résultat
	}

	/**
	 * @return the joueur1
	 */
	public String getJoueur1() {
		return joueur1;
	}

	/**
	 * @param joueur1 the joueur1 to set
	 */
	public void setJoueur1(String joueur1) {
		this.joueur1 = joueur1;
	}

	/**
	 * @return the joueur2
	 */
	public String getJoueur2() {
		return joueur2;
	}

	/**
	 * @param joueur2 the joueur2 to set
	 */
	public void setJoueur2(String joueur2) {
		this.joueur2 = joueur2;
	}

	/**
	 * @return the resultat
	 */
	public String getResultat() {
		return resultat;
	}

	/**
	 * @param resultat the resultat to set
	 */
	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the idCount
	 */
	public static int getIdCount() {
		return idCount;
	}

	/**
	 * @param idCount the idCount to set
	 */
	public static void setIdCount(int idCount) {
		Resultat.idCount = idCount;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Resultat [joueur1=" + joueur1 + ", joueur2=" + joueur2 + ", resultat=" + resultat + ", date=" + date
				+ ", id=" + id + "]";
	}

	/**
	 * cette fonction note la date du jour pour la renvoyer en chaine de caractères
	 * selon un format précis
	 * 
	 * @return la date en chaine de caractères
	 */
	public String dateDuJour() {
		Date laDate = new Date();

		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

		String laDateChaine = shortDateFormat.format(laDate);

		return laDateChaine;
	}

}
