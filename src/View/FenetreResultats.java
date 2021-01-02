package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Models.ResultatDefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenetreResultats extends JFrame {

	private JPanel contentPane;
	private JTable tableResults;
	private JScrollPane scrollPane;

	private JPanel panel;
	private JButton btnAccueil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreResultats frame = new FenetreResultats();
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
	public FenetreResultats() {
		super();
		setTitle("Resultats");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		tableResults = new JTable();

		tableResults.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column" }

		));

		scrollPane.setViewportView(tableResults);

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		btnAccueil = new JButton("Accueil");
		btnAccueil.setName("accueil");
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnAccueil);

	}

	public JTable getTableResults() {
		return tableResults;
	}

	public JButton getBtnAccueil() {
		return btnAccueil;
	}
}
