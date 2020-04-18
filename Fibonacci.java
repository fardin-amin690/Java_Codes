package practicefile;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many : ");
        int a = input.nextInt();
        int first = 0, seco = 1, fibo;
        System.out.println(first);
        System.out.println(seco);
        
        for (int i = 3; i <= a; i++) {
            
            fibo = first + seco;
            System.out.println(fibo);
            first = seco;
            seco = fibo;
            
        }
        
    }
    
}
