package com.techlab.model;

public class HatAdapter implements Item{

	private Hat hat;

	public HatAdapter(Hat hat) {
		this.hat = hat;
	}

	@Override
	public String itemName() {
		return hat.getLongName();
	}

	@Override
	public double itemPrice() {
		return hat.getPrice();
	}
	
	
}
