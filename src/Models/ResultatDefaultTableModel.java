package Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.table.DefaultTableModel;

/**
 * Classe qui est le modèle utilisé par le tableau des résultats
 * 
 * @author student
 *
 */
public class ResultatDefaultTableModel extends DefaultTableModel {

	private List<Resultat> resultats;

	private String[] entete = { "Date", "Pseudo Joueur 1", "Pseudo Joueur 2", "Resultat" };

	public ResultatDefaultTableModel(List<Resultat> r) {
		super();
		resultats = r;

	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return entete.length;
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return entete[column];
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return resultats == null ? 0 : resultats.size();
	}

	public boolean isCellEditable(int row, int column) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getValueAt(int row, int column) {
		switch (column) {
		case 0: {
			return resultats.get(row).getDate();
		}
		case 1: {
			return resultats.get(row).getJoueur1();

		}
		case 2: {
			return resultats.get(row).getJoueur2();

		}
		case 3: {
			return resultats.get(row).getResultat();

		}
		default: {
			return null;
		}
		}

	}

	@Override
	public void setValueAt(Object aValue, int row, int column) {
		// TODO Auto-generated method stub
		super.setValueAt(aValue, row, column);
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {
		case 0:
		case 1:
		case 2:
		case 3: {
			return String.class;
		}
		default: {
			return String.class;
		}
		}
	}

}
