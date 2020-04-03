/*
 * Assume that a vehicle plate number consists of
three uppercase letters followed by four digits. Write a program to generate a plate
number.
 */

import java.util.Random;

public class GenerateVehiclePlate {

	public static void main (String[]args) {
		
	
	Random rd = new Random ();
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	

	char slot1 = alphabet.charAt(rd.nextInt(26));
	char slot2 = alphabet.charAt(rd.nextInt(26));
	char slot3 = alphabet.charAt(rd.nextInt(26));
	int slot4 = rd.nextInt(8)+1;
	int slot5 = rd.nextInt(8)+1;
	int slot6 = rd.nextInt(8)+1;
	int slot7 = rd.nextInt(8)+1;
	
	System.out.println("The license plate number is "+ slot1+slot2+slot3+slot4+slot5+slot6+slot7);
	
	}
}
