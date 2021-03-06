package entities;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance;

//Constructors

	public Account() {

	}

	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

//Getters e Setters

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

//Functions

	public void withdraw(Double amount) {
		balance -= amount + 5.0;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

}
