package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTable;

import Models.ResultatDefaultTableModel;
import Models.Resultat;
import View.FenetreAccueil;
import View.FenetreResultats;

public class ControllerResultats implements ActionListener {

	private FenetreResultats fenetreResult;
	private FenetreAccueil fenetreAccueil;

	JTable table;

	ResultatDefaultTableModel tableModel;
	Resultat resultat;

	List<Resultat> lesResultats;

	public ControllerResultats(FenetreResultats fr, List<Resultat> lr, FenetreAccueil fa) {
		fenetreResult = fr;
		lesResultats = lr;
		fenetreAccueil = fa;

		table = fenetreResult.getTableResults();
		tableModel = new ResultatDefaultTableModel(lesResultats);
		table.setModel(tableModel);

		fenetreResult.getBtnAccueil().addActionListener(this);

		fenetreResult.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton btn = (JButton) e.getSource();

		switch (btn.getName()) {
		case "suppr": {
			System.out.println("pinguoin tier");
			break;
		}
		case "accueil": {
			fenetreAccueil.setVisible(true);
			fenetreResult.dispose();
			break;
		}
		default: {
			break;
		}

		}

	}

}
