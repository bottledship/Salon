package com.salon;

import java.util.Scanner;
import java.util.ArrayList;

public class Salon3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Nails3 pinky = new Nails3();
		
		System.out.println ("Salon Menu:  Enter Your Selections" );

		System.out.println ("1. Choose color:");
		pinky.color = scanner.nextLine();

		System.out.println ("2. Choose a nail shape:");
		pinky.shape = scanner.nextLine();
		
		System.out.println ("3. Add on Pedicure: type yes or no");
		pinky.addPedicure(scanner.nextLine());

		System.out.println("This is a summary of your services:\n" + pinky.getNailPreferences()) ;
		
	}
	
}