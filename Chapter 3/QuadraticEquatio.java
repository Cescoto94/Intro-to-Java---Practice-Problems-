/*
(Algebra: solve quadratic equations) The two roots of a quadratic equation
ax2 + bx + c = 0 can be obtained using the following formula:

b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.

Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots.”
Note you can use Math.pow(x, 0.5) to compute 2x. 
*/

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquatio
{
   public static void main(String[]args)
   {
   
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter an integer for a, b and c");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
   
      double discriminant = (b*b)-(4*a*c);
      b*=-1;
      double quadv1 =(b+Math.pow(discriminant,.5))/(2*a);
      double quadv2 =(b-Math.pow(discriminant,.5))/(2*a);

   
      if(discriminant > 0)
      {
                  System.out.println("The equation has two roots "+quadv1+" and "+quadv2);
      }
      else if(discriminant ==0)
      {   
         System.out.println("The equation has one root "+quadv1);
      }
      else
      {
         System.out.println("The equation has no real roots");
      }
   }
}
   
   
   
   
      
