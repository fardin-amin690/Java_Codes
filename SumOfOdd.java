package practicefile;

import java.util.Scanner;

public class SumOfOdd {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, a,b;
        System.out.print("Please Enter an Initial Number : ");
        a = input.nextInt();
        System.out.print("Please Enter a Terminal Number : ");
        b = input.nextInt();
        for (int i = a; i <= b; i++) {
            if (i%2 !=0) {
                
                sum = sum + i;
                System.out.print(" "+i);
            }
                 
                     
        }
          
            System.out.println(" Sum Of Odd Numbers : "+sum);
                }
    
}
