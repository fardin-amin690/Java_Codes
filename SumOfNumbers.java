package practicefile;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        float sum = 0;
        float a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an Initial Number : ");
        a = input.nextFloat();
        System.out.print("Please enter a Terminal Number : ");
        b = input.nextFloat();

        for (float i = a; i <= b; i++) {
            sum = sum + i;
          
            
        }
          System.out.println("Sum of all numbers : "+sum);
    }
    
}
