import java.util.ArrayList;
import java.util.List;
import Controller.ControllerAccueil;
import Models.Resultat;
import View.FenetreAccueil;

public class App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Resultat> lr = new ArrayList<Resultat>();

		try {
			new ControllerAccueil(new FenetreAccueil(), lr);
		} catch (Exception el) {
			el.printStackTrace();
		}
		
		
		
	}

}
