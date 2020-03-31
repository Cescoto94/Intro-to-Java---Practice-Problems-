/*
Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and
dividing, by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
one pound is 0.45359237 kilograms and one inch is 0.0254 meters. 
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class BMI
{
   public static void main(String[]args)
   {
   Scanner sc = new Scanner(System.in);
   DecimalFormat format = new DecimalFormat("0.#");
   
   final double KILOGRAM_POUND =.45359237;
   final double INCH_METERS=.0254;
   
   System.out.println("Enter weight in pounds and height in inches");
   double weight = sc.nextDouble();
    double height = sc.nextDouble();
   weight =weight*KILOGRAM_POUND;
   height =height*INCH_METERS;
   double BMI = weight/(height*height);
   System.out.println("BMI is "+format.format(BMI));
   
   }
}
   
      