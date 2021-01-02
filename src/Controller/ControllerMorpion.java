package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import View.FenetreMorpion;
import View.FenetreResultats;
import View.FenetreAccueil;
import Models.JeuMorpion;
import Models.Resultat;

public class ControllerMorpion implements ActionListener {
	private FenetreMorpion fenetre;
	private JeuMorpion morpion;
	private String result, joueur1, joueur2;
	private FenetreAccueil fenetreAccueil;
	private List<Resultat> lesResultats;

	public ControllerMorpion(FenetreMorpion f, String j1, String j2, FenetreAccueil fa, List<Resultat> lr) {
		fenetre = f;
		fenetreAccueil = fa;
		lesResultats = lr;
		joueur1 = j1;
		joueur2 = j2;

		fenetre.getBtnMorpion_1().addActionListener(this);
		fenetre.getBtnMorpion_2().addActionListener(this);
		fenetre.getBtnMorpion_3().addActionListener(this);
		fenetre.getBtnMorpion_4().addActionListener(this);
		fenetre.getBtnMorpion_5().addActionListener(this);
		fenetre.getBtnMorpion_6().addActionListener(this);
		fenetre.getBtnMorpion_7().addActionListener(this);
		fenetre.getBtnMorpion_8().addActionListener(this);
		fenetre.getBtnMorpion_9().addActionListener(this);
		fenetre.getBtnRejouer().addActionListener(this);
		fenetre.getBtnQuitter().addActionListener(this);
		fenetre.getBtnResultats().addActionListener(this);

		fenetre.setVisible(true);

		morpion = new JeuMorpion(joueur1, joueur2);
		fenetre.getLblJoueur().setText("C'est au tour de : " + morpion.getTrait() + "   ");
	}

	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		
		
		switch (btn.getName()) {
		case "replay": {

			/**
			 * permet de rénitialiser les boutons afin de pouvoir rejouer !
			 */

			fenetre.getBtnMorpion_1().setIcon(null);
			fenetre.getBtnMorpion_2().setIcon(null);
			fenetre.getBtnMorpion_3().setIcon(null);
			fenetre.getBtnMorpion_4().setIcon(null);
			fenetre.getBtnMorpion_5().setIcon(null);
			fenetre.getBtnMorpion_6().setIcon(null);
			fenetre.getBtnMorpion_7().setIcon(null);
			fenetre.getBtnMorpion_8().setIcon(null);
			fenetre.getBtnMorpion_9().setIcon(null);

			fenetre.getBtnMorpion_1().setEnabled(true);
			fenetre.getBtnMorpion_2().setEnabled(true);
			fenetre.getBtnMorpion_3().setEnabled(true);
			fenetre.getBtnMorpion_4().setEnabled(true);
			fenetre.getBtnMorpion_5().setEnabled(true);
			fenetre.getBtnMorpion_6().setEnabled(true);
			fenetre.getBtnMorpion_7().setEnabled(true);
			fenetre.getBtnMorpion_8().setEnabled(true);
			fenetre.getBtnMorpion_9().setEnabled(true);

			morpion.resetGrille();
			morpion.resetNbrCoup();
			fenetre.getLblGagnant().setText("");

			result = morpion.checkWinner();

			if (result != null) {
				System.out.println("Match gagner par " + morpion.getTrait());

				/**
				 * Trait au perdant
				 */
				if (morpion.getTrait() == joueur1) {
					/**
					 * trait au joueur2
					 */
					morpion.setTrait(joueur2);
				} else {
					morpion.setTrait(joueur1);
				}

				/**
				 * Si la partie n'est pas gagne et que plus personne ne peut jouer
				 */
			} else if (morpion.getNbrCoup() == 9) {
				System.out.println("Match Nul");

				/**
				 * Inverse le trait
				 */
				if (morpion.getTrait() == joueur1) {
					morpion.setTrait(joueur2);
				} else {
					morpion.setTrait(joueur1);
				}
			}
			break;
		}
		case "acceuil": {
			/**
			 * Quitte la partie du morpion et nous ramene sur l'accueil
			 */
			fenetreAccueil.setVisible(true);
			fenetre.dispose();
			break;
		}
		/**
		 * permet de fermer la fenetre de jeu et d'ouvrir celle des resultats
		 */
		case "btnResultats": {
			fenetre.setVisible(false);
			try {
				new ControllerResultats(new FenetreResultats(), lesResultats, fenetreAccueil);
			} catch (Exception el) {
				el.printStackTrace();
			}
			break;
		}

		default: {
			String pre_position = btn.getName().substring(btn.getName().length() - 1);
			int position = Integer.parseInt(pre_position) - 1;

			morpion.insert(position, morpion.getTrait());
			result = morpion.checkWinner();

			if(morpion.getTrait() == joueur1) {
				btn.setIcon(new ImageIcon(FenetreMorpion.class.getResource("/ressources/multiply.png")));
			} else {
				btn.setIcon(new ImageIcon(FenetreMorpion.class.getResource("/ressources/oval.png")));
			}
			
			btn.setEnabled(false);

			/**
			 * actualise un label pour afficher a l'écran le gagnant, ou si il y a eu un
			 * match nul.
			 */
			if (result != null) {
				fenetre.getLblGagnant().setText(result);

			} else if (morpion.getNbrCoup() == 9) {
				result = "match nul";
				fenetre.getLblGagnant().setText(result);
			}

			/**
			 * Si la partie est terminée, désactive la possibilité de cliquer sur des
			 * boutons supplémentaires
			 */
			if (result != null || morpion.getNbrCoup() == 9) {
				fenetre.getBtnMorpion_1().setEnabled(false);
				fenetre.getBtnMorpion_2().setEnabled(false);
				fenetre.getBtnMorpion_3().setEnabled(false);
				fenetre.getBtnMorpion_4().setEnabled(false);
				fenetre.getBtnMorpion_5().setEnabled(false);
				fenetre.getBtnMorpion_6().setEnabled(false);
				fenetre.getBtnMorpion_7().setEnabled(false);
				fenetre.getBtnMorpion_8().setEnabled(false);
				fenetre.getBtnMorpion_9().setEnabled(false);

				/**
				 * rajoute un résultat a la liste de résultats
				 */
				Resultat unResultat = new Resultat(joueur1, joueur2, result);
				lesResultats.add(unResultat);

			}
			morpion.changeTrait();
			fenetre.getLblJoueur().setText("C'est au tour de : " + morpion.getTrait() + "   ");
			break;
		}
		}

	}

}
