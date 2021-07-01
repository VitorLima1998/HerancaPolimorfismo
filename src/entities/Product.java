package entities;

public class Product {
	
	private String name;
	private Double price;
	
//Constructors
	
	public Product () {
		
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

//Getters & Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
//Functions
	
	public String toString() {
		return name 
				+ " $"
				+String.format("%.2f", price);
	}
	
}
