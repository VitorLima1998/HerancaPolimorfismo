package entities;

public class PessoaJuridica extends Pessoa {
	
	private Integer numFunc;

//Constructors 
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double anualIncome, Integer numFunc) {
		super(name, anualIncome);
		this.numFunc = numFunc;
	}

//Getters & Setters
	
	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	} 
	
//Functions 
	
	@Override
	
	public Double tax() {
		if (numFunc < 10) {
			return getAnualIncome() * 0.16;
		} else { 
			return getAnualIncome() * 0.14;
		}
	}

}
