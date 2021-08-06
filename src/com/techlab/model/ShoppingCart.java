package com.techlab.model;

import java.util.*;

public class ShoppingCart {
	List<Item> items = new ArrayList<Item>();
	private double totPrice;
	
	public void add(Item i) {
		this.items.add(i);
	}
	
	public void remove(Item i) {
		this.items.remove(i);
	}
	
	public double totalPrice() {
		totPrice = 0;
		for(Item i: items) {
			totPrice += i.itemPrice();
		}
		return totPrice;
	}
	
	public void display() {
		for(Item i: items) {
			System.out.println("Item Name: "+i.itemName());
			System.out.println("Item Price: "+i.itemPrice());
		}
		System.out.println("Total Price Of All Items In Cart: "+this.totalPrice());
	}	
}
