/*
 * Write a program that uses for, while, and do-while loop
statements to display the multiplication table.
 */
import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int j = 1;
		System.out.println("Enter a string:");
		String userInput = sc.nextLine();
		while(i<10) {
			j =1;
				while(j<10) {
					System.out.print(i+"*"+j+"="+i*j+"\t");
					j++;
				}
				i++;
				System.out.println();
			
	
		}
		
	}
		
	}


