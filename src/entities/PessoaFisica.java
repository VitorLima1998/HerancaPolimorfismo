package entities;

public class PessoaFisica extends Pessoa {

	private Double healthExpense;

//Constructors

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double anualIncome, Double healthExpense) {
		super(name, anualIncome);
		this.healthExpense = healthExpense;
	}

//Getters & Setters

	public Double getHealthExpense() {
		return healthExpense;
	}

	public void setHealthExpense(Double healthExpense) {
		this.healthExpense = healthExpense;
	}

	@Override
	public Double tax() {
		if (super.getAnualIncome() < 20000.0) {
			return getAnualIncome() * 0.15 - healthExpense * 0.50;
		} else {
			return getAnualIncome() * 0.25 - healthExpense * 0.50;
		}
	}

}
