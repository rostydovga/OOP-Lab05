package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private String name;
	private double quantity;
	
	public ProductImpl(final String name, final double quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public double getQuantity() {
		// TODO Auto-generated method stub
		return this.quantity;
	}

}
