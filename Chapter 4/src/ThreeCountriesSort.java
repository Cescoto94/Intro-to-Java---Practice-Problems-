/*
 * Write a program that prompts the user to enter three countries
and displays them in descending order. 
 */
import java.util.Scanner;

public class ThreeCountriesSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your three countries. Press enter after each country to input.");
		String c1 = scan.nextLine();
		String c2 = scan.nextLine();
		String c3= scan.nextLine();
		
		if (c1.compareTo(c2)>0 && c1.compareTo(c3)>0) {
			if(c2.compareTo(c3)>0 ) 
				System.out.println("The three countries in descending order are "+c1+" "+c2+" "+c3);
				else
				System.out.println("The three countries in descending order are "+c1+" "+c3+" "+c2);	
			
		}
		if (c2.compareTo(c1)>0 && c2.compareTo(c3)>0) {
			if(c1.compareTo(c3)>0 ) 
				System.out.println("The three countries in descending order are "+c2+" "+c1+" "+c3);
				else
				System.out.println("The three countries in descending order are "+c2+" "+c3+" "+c1);	
			

	}
		if (c3.compareTo(c2)>0 && c3.compareTo(c1)>0) {
			if(c2.compareTo(c1)>0 ) 
				System.out.println("The three countries in descending order are "+c3+" "+c2+" "+c1);
				else
				System.out.println("The three countries in descending order are "+c3+" "+c1+" "+c2);	
			

}
	}
}

