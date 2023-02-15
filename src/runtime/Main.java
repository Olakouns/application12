package runtime;

import contrôleur.CurrencyController;
import modele.CurrencyModel;
import vue.CurrencyView;

public class Main {

	public static void main(String[] args) {
	    CurrencyModel model = new CurrencyModel();
	    CurrencyView view = new CurrencyView();
	    CurrencyController controller = new CurrencyController(model, view);
	    controller.run();
	}

}
