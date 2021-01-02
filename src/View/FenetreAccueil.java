package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FenetreAccueil extends JFrame {

	private JPanel contentPane;
	private JButton btnJouer;
	private JButton btnRsultats;
	private JButton btnQuitter;
	private JPanel panel_2;
	private JLabel lblJoueur1;
	private JLabel lblJoueur2;
	private JTextField textFieldJoueur1;
	private JTextField textFieldJoueur2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreAccueil frame = new FenetreAccueil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FenetreAccueil() {
		setTitle("Jeu du Morpion");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		btnJouer = new JButton("Jouer");
		btnJouer.setName("jouer");
		panel.add(btnJouer);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		btnRsultats = new JButton("Resultats");
		btnRsultats.setName("resultats");
		panel_1.add(btnRsultats);

		btnQuitter = new JButton("Quitter");
		btnQuitter.setName("quitter");
		panel_1.add(btnQuitter);

		panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);

		lblJoueur1 = new JLabel("Joueur 1 :");
		panel_2.add(lblJoueur1);

		textFieldJoueur1 = new JTextField();
		textFieldJoueur1.setName("joueur1");
		panel_2.add(textFieldJoueur1);
		textFieldJoueur1.setColumns(10);

		lblJoueur2 = new JLabel("Joueur 2 : ");
		panel_2.add(lblJoueur2);

		textFieldJoueur2 = new JTextField();
		textFieldJoueur2.setName("joueur2");
		panel_2.add(textFieldJoueur2);
		textFieldJoueur2.setColumns(10);
	}

	public JButton getBtnJouer() {
		return btnJouer;
	}

	public JButton getBtnRsultats() {
		return btnRsultats;
	}

	public JButton getBtnQuitter() {
		return btnQuitter;
	}

	public JTextField getTextFieldJoueur2() {
		return textFieldJoueur2;
	}

	public JTextField getTextFieldJoueur1() {
		return textFieldJoueur1;
	}
}
