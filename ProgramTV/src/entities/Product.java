package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalvalueinstock() {
		return price * quantity;
	}
	
	public void addproducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeproducts(int quantity) {
		this.quantity -= quantity;
	}

}
