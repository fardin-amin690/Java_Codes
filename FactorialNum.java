package practicefile;

import java.util.Scanner;

public class FactorialNum {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,fact = 1;
        System.out.print("Please Enter a Number : ");
        a = input.nextInt();
               for (int i = a; i >= 1; i--) {
           
                
                fact = fact * i;
                System.out.print(" "+i);
            
                 
                     
        }
          System.out.println("");
            System.out.println("Factorial Of "+a+" is : "+fact);
                }
    
}
