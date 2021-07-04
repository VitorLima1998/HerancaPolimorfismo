package entities;

public abstract class Pessoa {

	private String name;
	public Double anualIncome;

//Constructors	

	public Pessoa() {

	}

	public Pessoa(String name, Double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
//Getters & Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
//Functions 
	
	public abstract Double tax();	

}
