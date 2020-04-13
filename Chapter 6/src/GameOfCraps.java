/*
 * Game: craps) Craps is a popular dice game played in casinos. Write a program
to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6, respectively.
Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player. Here are some sample runs.
 */

import java.util.Scanner;
import java.util.Random;

public class GameOfCraps {

	public static void main (String[]args) {
		
		int roll1 =0;
		int roll2 =0;
		int point =0;
		char cont = 'Y';
		int sum =0;
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	System.out.println("Roll the dice?(Y/N)");
	char userInput =sc.next().charAt(0);
	
	if(userInput =='Y' && cont == 'Y') {
		 roll1= rd.nextInt(6)+1;
			
		 roll2  =rd.nextInt(6)+1;
		 sum = (roll1+roll1);
	
		
		System.out.println("You rolled "+ roll1+" + "+roll2+" = "+sum);
		
	if (CrapsResult(roll1,roll2) ==1) {
		System.out.println("Natural! You win!");
		System.out.println("Play again? (Y/N)");
		 cont = sc.next().charAt(0);
		
	}else if(CrapsResult(roll1,roll2) ==-1) {
			System.out.println(" Craps! You lose!");
			System.out.println("Play again? (Y/N)");
			 cont = sc.next().charAt(0);
			 
	}else {  
					System.out.println("Point is "+sum);
					point = sum;
					}
	 
					
	
	while(point == sum) {
		int i= rd.nextInt(6)+1;
			
		 int j =rd.nextInt(6)+1;
		 System.out.println("You rolled "+ i+"+ "+j+" = "+(i+j));
		while(CrapsResult(i,j,point)!=0)
		{
			if(CrapsResult(i,j,point)==1) {
				System.out.println("Natural! You win!");
				point = 0;
				System.out.println("Play again? (Y/N)");
				 cont = sc.next().charAt(0);
				
			}else if(CrapsResult(i,j,point)==-1) {
				System.out.println(" Craps! You lose!");
				System.out.println("Play again? (Y/N)");
				point =0;
				 cont = sc.next().charAt(0);
				
			}
			i= rd.nextInt(6)+1;
			j  =rd.nextInt(6)+1;
			CrapsResult(i,j,point);
		}
	}
		}
		
	}
	
	public static int CrapsResult(int x, int y) {
		
		int sum = x+y;
		int result;
		if (sum == 7 || sum == 11) {
			result =1;
		
			
		}else if(sum ==2 || sum == 3 ||sum ==12) {
			
			result = -1;
		}else
			result =0;
		
		return result;
	}
	public static int CrapsResult(int x, int y, int point) {
		int p =point;
		int sum = x+y;
		int result;
		if (sum == p) {
			result =1;
		
			
		}else if(sum ==7) {
			
			result = -1;
			
		}else
			result =0;
		
		return result;
	}


}
