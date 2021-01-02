package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

import Models.Resultat;
import View.FenetreAccueil;
import View.FenetreMorpion;
import View.FenetreResultats;

public class ControllerAccueil implements ActionListener {

	private FenetreAccueil fenetre;

	List<Resultat> lesResultats = new ArrayList<Resultat>();

	public ControllerAccueil(FenetreAccueil f, List<Resultat> lr) {
		fenetre = f;
		lesResultats = lr;

		fenetre.getBtnJouer().addActionListener(this);
		fenetre.getBtnQuitter().addActionListener(this);
		fenetre.getBtnRsultats().addActionListener(this);

		fenetre.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btn = (JButton) e.getSource();
		String j1;
		String j2;

		switch (btn.getName()) {
		case "jouer": {

			/**
			 * isj1Empty et isJ2Empty permette de vérifier a l'aide de la boucle if si les
			 * utilisateurs ont inscrit un pseudo si ceux-ci ne l'ont pas fait, Joueur1 et
			 * Joueur2 seront les nom par défaut
			 */
			int isJ1Empty = fenetre.getTextFieldJoueur1().getText().length();
			int isJ2Empty = fenetre.getTextFieldJoueur2().getText().length();

			if (isJ1Empty != 0) {
				j1 = fenetre.getTextFieldJoueur1().getText();
			} else {
				j1 = "joueur1";
			}
			if (isJ2Empty != 0) {
				j2 = fenetre.getTextFieldJoueur2().getText();
			} else {
				j2 = "joueur2";
			}

			fenetre.setVisible(false);

			try {
				/**
				 * permet de créé la fenetre du morpion
				 */
				new ControllerMorpion(new FenetreMorpion(), j1, j2, fenetre, lesResultats);

			} catch (Exception el) {
				el.printStackTrace();
			}
			break;
		}
		case "quitter": {
			/**
			 * permet de quitter l'application
			 */
			fenetre.dispose();
			break;
		}
		case "resultats": {
			fenetre.setVisible(false);
			try {
				/**
				 * permet de créé la fenetre des résultats
				 */
				new ControllerResultats(new FenetreResultats(), lesResultats, fenetre);
			} catch (Exception el) {
				el.printStackTrace();
			}
		}
		default: {
			fenetre.dispose();
			break;
		}

		}

	}

}
