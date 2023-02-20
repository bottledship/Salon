package com.salon;

import java.util.Scanner;
import java.util.ArrayList;

public class Salon3 {

	public static void main(String[] args) {
		ArrayList<String> summary;
		
		summary = new ArrayList<String>();	
		
		Scanner scanner = new Scanner(System.in);
			
		
		System.out.println ("Salon Menu:  Enter Your Selections \n" );
		System.out.println ("1. Choose color: \n");
		String color = scanner.nextLine();
		summary.add(color);
		
		
		System.out.println ("2. Choose a nail shape: \n");
		String shape = scanner.nextLine();
		summary.add(shape);
		
		System.out.println ("3. Add on Pedicure: type yes or no \n");
		String addPedicure = scanner.nextLine();
		summary.add(addPedicure);
	
		if (addPedicure.equals("yes")) {
			System.out.println ("Total Price: $"+ Nails.extraPrice +"");
			String finalPrice = "30";
			summary.add(finalPrice);
			Nails3 x = new Nails3 (color, shape, addPedicure, finalPrice);
			System.out.println("This is a summary of your services: " +x.toString());
		}
		else if (addPedicure.equals("no")) {
			System.out.println ("Total Price: $"+ Nails.price +"");	
			String finalPrice = "20";
			summary.add(finalPrice);
			Nails3 y = new Nails3 (color, shape, addPedicure, finalPrice);
			System.out.println("This is a summary of your services: " +y.toString());			
		}
		
	}
	
}