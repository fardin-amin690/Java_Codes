package practicefile;

import java.util.Scanner;

public class MoneyInterest {
        public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("enter amount : ");
        double a = input.nextDouble();
        System.out.print("enter rate : ");
        double b = input.nextDouble();
        System.out.print("enter time : ");
        double c = input.nextDouble();
        double r = a*b*c / 100; 
        System.out.println("result : "+r);
    
}
 }
