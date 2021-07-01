package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
//Constructors
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

//Getters & Setters
	
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String toString() {
		return super.getName() 
				+ "(used) $ "
				+ String.format("%.2f", super.getPrice())
				+ "(Manufacture date: " 
				+ sdf.format(manufactureDate) 
				+ ")";
	}
	

}
