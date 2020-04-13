/*
 * Write a method that computes the sum of the digits
in an integer. Use the following method header:
public static int sumDigits(long n)
 */
import java.util.Scanner;
public class SumDigits {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to sum:");
		long userInput = sc.nextLong();
		
		System.out.println("The sum of the number is:"+sumDigits(userInput));
		
		
		
	}

	public static int sumDigits(long n) {
		int sum =0;
		while( n!=0) {
			sum += (int)n%10;
			n/=10;
			
			
		}
	
		return sum;
		
	}
}
