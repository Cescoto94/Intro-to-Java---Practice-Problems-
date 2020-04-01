/*
Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of each package and displays the one with the
better price. 
*/
import java.util.Scanner;
public class FinancialCompareCosts{
   
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
   
      System.out.println("Enter the weight and price of package 1:");
      double weight = sc.nextDouble();
      double price = sc.nextDouble();
   
      double rice1 = price/weight;
   
      System.out.println("Enter the price and weight of package 2:");
      weight = sc.nextDouble();
      price = sc.nextDouble();
      double rice2 = price/weight;  
    
      if(rice1>rice2)
         System.out.println("The second package is cheaper.");
      else
         System.out.println("The first package is cheaper.");
   
   }
}