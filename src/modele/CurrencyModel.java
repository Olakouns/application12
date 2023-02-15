package modele;

public class CurrencyModel {

    private double amount;
    private String currency ;
    private double result;
    Double[] currenciesRate = { 1.31, 602.07, 744.12, 655.29, 0.071 };
	

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getResult() {
		return result;
	}


	public void convert(double amount, int idCurrency) {
		result = amount * currenciesRate[idCurrency];
	}
	


}
