package com.techlab.test;

import com.techlab.model.Hat;
import com.techlab.model.HatAdapter;
import com.techlab.model.ShoppingCart;

public class AdapterTest {
	public static void main(String []args) {
		ShoppingCart sc = new ShoppingCart();
		
		HatAdapter h1 = new HatAdapter(new Hat("Golden","Golden Premium Hat",999));
		HatAdapter h2 = new HatAdapter(new Hat("Rose","Rose Black Hat",520));
		HatAdapter h3 = new HatAdapter(new Hat("Matte","Fine Matte Hat",780));
		HatAdapter h4 = new HatAdapter(new Hat("Falcon","Churnished Falcon Hat",560));
		HatAdapter h5 = new HatAdapter(new Hat("Furred","Furred Peacock Hat",510));
		sc.add(h1); 
		sc.add(h2);
		sc.add(h3);
		sc.add(h4);
		sc.add(h5);
		
		System.out.println("Total Items in Cart: ");
		sc.display();
		
		sc.remove(h3);
		sc.remove(h5);
		
		System.out.println("\nAfter Removing Elements:");
		System.out.println("Total Items in Cart: ");
		sc.display();
		
	}
}
