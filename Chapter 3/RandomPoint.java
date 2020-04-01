/*
Write a program that displays a random coordinate in a rectangle.
The rectangle is centred at (0, 0) with width 50 and height 150.
*/

import java.util.*;

public class RandomPoint
{
   public static void main(String[]args)
   {
   Random rand = new Random();
   Scanner scan = new Scanner(System.in);
   int rand_ycoord = rand.nextInt(151);
   int rand_xcoord = rand.nextInt(51);
   System.out.println("The random coordinate is "+rand_xcoord+", "+rand_ycoord);
   
   }
}