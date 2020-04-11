/*
 * (Longest common prefix) Write a program that prompts the user to enter two
strings and displays the largest common prefix of the two strings.
 */
import java.util.Scanner;

public class CommonPrefix {
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a sentence:");
		String s1 = sc.nextLine();
		System.out.println("Please enter second sentence:");
		String s2 = sc.nextLine();
		
		if (s1.compareTo(s2)== 0) {
		 String end = "The two statements are identical"; 
		
		System.out.println(end);
		}else {
			int i = 0;
			int j = 0;
			while(s1.substring(i,j).compareTo(s2.substring(i,j))==0) {
				j++;	
		}
			System.out.println(s1.substring(i,j));
		

		}
		
	}	
	}

