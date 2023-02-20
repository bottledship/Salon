package com.salon;

public class Nails3 {

	//class attributes
		public String color;
		public String shape;
		public Boolean wantsPedicure = false;
		public Integer basePrice = 20;
		public Integer pedicurePrice = 10;
		public Integer totalPrice = basePrice;

		//constructor

		
		//method to add on pedicure or not
		public void addPedicure(String preference) {
			if (preference.equals("yes")) {
				wantsPedicure = true;
				totalPrice += pedicurePrice;
			}
		}
				
		//method display summary
		public String getNailPreferences() {
		return ("Nail:\ncolor: " + color + ",\nshape: " + shape + ",\npedicure: " + (wantsPedicure ? "yes" : "no") +",\nprice: $" + totalPrice +".");
		}
		
}
