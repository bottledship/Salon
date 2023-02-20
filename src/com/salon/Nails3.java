package com.salon;

public class Nails3 {

	//class attributes
		public String color;
		public String shape;
		public String addPedicure;
		static String price = "20";
		static String extraPrice = "30";
		public String finalPrice;

		//constructor
		public Nails3 (String color, String shape, String addPedicure, String finalPrice) {

		//set values
		this.color = color;
		this.shape = shape;
		this.addPedicure = addPedicure;
		this.finalPrice = finalPrice;
		}
		
		//method to add on pedicure or not
		public void addPedicure() {
			if (addPedicure.equals("yes")) 
			finalPrice = extraPrice;
			else
			finalPrice = price;
		}
				
		//method display summary
		public String toString() {
		return("Nails [color = " + color + ", shape = " + shape + ", Pedicure = " + addPedicure +", Price = $" + finalPrice +"]");
		}
		
}
