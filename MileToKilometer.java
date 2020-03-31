import java.util.*;
import java.text.DecimalFormat;

class MileToKilometer{

public static void main(String[]args){

Scanner sc= new Scanner(System.in);
System.out.println("Enter the miles: ");
int miles = sc.nextInt();
double km =(double) miles*1.6;
DecimalFormat format = new DecimalFormat("0.#");
System.out.println(miles+" miles is "+(format.format(km))+" kilometers");
}
}