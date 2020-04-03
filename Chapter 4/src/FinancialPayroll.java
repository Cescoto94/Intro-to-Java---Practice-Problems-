/*Write a program that reads the following information
and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
*/

import java.util.Scanner;

public class FinancialPayroll{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the employee's name:");
		String name =sc.nextLine();
		System.out.println("Enter number of hours worked in a week:");
		double hours = sc.nextDouble();
		System.out.println("Enter hourly pay rate:");
		double payRate = sc.nextDouble();
		System.out.println("Enter federal tax witholding rate:");
		double fedw = sc.nextDouble();
		System.out.println("Enter state tax witholding rate:");
		double statew= sc.nextDouble();
		
		double grossPay=(payRate*hours);
		double totalFedW = grossPay*fedw;
		double totalStateW =grossPay*statew;
		
		System.out.println("Employee name:"+ name);
		System.out.println("Hours worked:"+ hours);
		System.out.printf("Pay rate: $%4.2f",payRate);
		System.out.printf("\nGross pay: $%4.2f",(payRate*hours));
		System.out.println("\nDeductions:");
		System.out.println("\tFederal tax witholding (" +fedw*100+"%): $"+totalFedW);
		System.out.print("\tState tax witholding (" +statew*100+"%):");
		System.out.printf("$%4.2f",(totalStateW));
		System.out.printf("\n\tTotal Deduction: $%4.2f",(totalFedW+totalStateW));
		System.out.printf("\nNet Pay: $%4.2f",(grossPay-totalFedW-totalStateW));
		
		
		
	
		


	}

}
