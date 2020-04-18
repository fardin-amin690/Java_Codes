package practicefile;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter An Initial Number :");
        int a = input.nextInt();
          System.out.print("Enter A Terminal Number :");
        int b = input.nextInt();
        int count = 0;
        
        for (int i = a; i <= b; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    count++;
                    break;                  
                }   
                 
                }
                          
                 if (count==0) {
                    System.out.println(i);
                    }
                 count=0;
            }
        
            
        }
    }
