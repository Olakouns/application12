package contrôleur;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import modele.CurrencyModel;
import vue.CurrencyView;

public class CurrencyController {

    private CurrencyModel model;
    private CurrencyView view;
    
    public CurrencyController(CurrencyModel model, CurrencyView view) {
        this.model = model;
        this.view = view;
        addCaretListener();
        addItemListener();
    }

    public void run() {
    	view.start();
    }
    public void addCaretListener() {
    	view.addCaretListener(new CaretListener() {

			@Override
			public void caretUpdate(CaretEvent e) {
				update();
			}
    	});
    }
    public void addItemListener() {
    	view.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				update();
				
			}
		});
    	
    };
    public void update() {
    	try {
    		double amount = Double.parseDouble(view.getAmountFieldText());
    		int idCurrency = view.getcurrenciesListIndex();
    		model.convert(amount,idCurrency);
    		DecimalFormat df = new DecimalFormat("0.00");
    		view.setcfaValue(df.format(model.getResult()));
		} catch (Exception error) {
			
		}
    }
}
