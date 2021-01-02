package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FenetreMorpion extends JFrame {

	private JPanel contentPane;
	private JButton btnMorpion_1;
	private JButton btnMorpion_2;
	private JButton btnMorpion_3;
	private JButton btnMorpion_4;
	private JButton btnMorpion_5;
	private JButton btnMorpion_6;
	private JButton btnMorpion_7;
	private JButton btnMorpion_8;
	private JButton btnMorpion_9;
	private JButton btnRejouer;
	private JButton btnQuitter;
	private JButton btnResultats;
	private JPanel panel_1;
	private JLabel lblTxt;
	private JLabel lblGagnant;
	private JLabel lblJoueur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreMorpion frame = new FenetreMorpion();
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
	public FenetreMorpion() {
		setTitle("Morpion");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 515, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		btnMorpion_1 = new JButton("");
		btnMorpion_1.setName("btnMorpion_1");
		panel.add(btnMorpion_1);

		btnMorpion_2 = new JButton("");
		btnMorpion_2.setName("btnMorpion_2");
		panel.add(btnMorpion_2);

		btnMorpion_3 = new JButton("");
		btnMorpion_3.setName("btnMorpion_3");
		panel.add(btnMorpion_3);

		btnMorpion_4 = new JButton("");
		btnMorpion_4.setName("btnMorpion_4");
		panel.add(btnMorpion_4);

		btnMorpion_5 = new JButton("");
		btnMorpion_5.setName("btnMorpion_5");
		panel.add(btnMorpion_5);

		btnMorpion_6 = new JButton("");
		btnMorpion_6.setName("btnMorpion_6");
		panel.add(btnMorpion_6);

		btnMorpion_7 = new JButton("");
		btnMorpion_7.setName("btnMorpion_7");
		panel.add(btnMorpion_7);

		btnMorpion_8 = new JButton("");
		btnMorpion_8.setName("btnMorpion_8");
		panel.add(btnMorpion_8);

		btnMorpion_9 = new JButton("");
		btnMorpion_9.setName("btnMorpion_9");
		panel.add(btnMorpion_9);

		btnQuitter = new JButton("Accueil");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnQuitter.setName("acceuil");
		panel.add(btnQuitter);

		btnRejouer = new JButton("Rejouer");
		btnRejouer.setName("replay");
		panel.add(btnRejouer);

		btnResultats = new JButton("Resultats");
		btnResultats.setName("btnResultats");
		panel.add(btnResultats);

		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		lblJoueur = new JLabel("joueur 1 (X) :");
		panel_1.add(lblJoueur);

		lblTxt = new JLabel("Le gagnant est : ");
		panel_1.add(lblTxt);

		lblGagnant = new JLabel("");
		lblGagnant.setName("gagnant");
		panel_1.add(lblGagnant);
	}

	public JButton getBtnMorpion_1() {
		return btnMorpion_1;
	}

	public JButton getBtnMorpion_2() {
		return btnMorpion_2;
	}

	public JButton getBtnMorpion_7() {
		return btnMorpion_7;
	}

	public JButton getBtnMorpion_8() {
		return btnMorpion_8;
	}

	public JButton getBtnMorpion_3() {
		return btnMorpion_3;
	}

	public JButton getBtnMorpion_4() {
		return btnMorpion_4;
	}

	public JButton getBtnMorpion_9() {
		return btnMorpion_9;
	}

	public JButton getBtnMorpion_6() {
		return btnMorpion_6;
	}

	public JButton getBtnMorpion_5() {
		return btnMorpion_5;
	}

	public JButton getBtnRejouer() {
		return btnRejouer;
	}

	public JButton getBtnQuitter() {
		return btnQuitter;
	}

	public JButton getBtnResultats() {
		return btnResultats;
	}

	public JLabel getLblGagnant() {
		return lblGagnant;
	}
	public JLabel getLblJoueur() {
		return lblJoueur;
	}
}
