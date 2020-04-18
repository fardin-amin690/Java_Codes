package practicefile;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the line numbers : ");
        int a = input.nextInt();
        for (int row = 1; row <= a; row++) {
            for (int col = row; col <= a; col++) {
                System.out.print(" "+col);
                
            }
            System.out.println("");
            
        }
    }
    
}
