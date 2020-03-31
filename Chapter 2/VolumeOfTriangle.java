/*
Compute the volume of a triangle) Write a program that reads in the length of
sides of an equilateral triangle and computes the area and volume using the following
formulas:
area =
23
4
(length of sides)2
volume = area * length

*/

import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Scanner;
public class VolumeOfTriangle
{
   public static void main(String[]args)
   {
      Scanner sc = new Scanner(System.in);
      DecimalFormat format = new DecimalFormat("0.#");
      
      System.out.println("Enter length of the sides and height of the Equilateral triangle: ");
      double sides = sc.nextDouble();
   
      double area = (Math.sqrt(3)/4)*(sides*sides);
      double volume = area*sides;
      System.out.println("The area is "+(format.format(area)));
      System.out.println("The volume of the triangular prism is "+(format.format(volume)));
      
   }
}
      
      