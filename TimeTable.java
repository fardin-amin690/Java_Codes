package practicefile;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        int a;
        for (int i = 1; i <= 10; i++) {
            a = num*i;
            System.out.println(num+" X "+i+" = "+a);
            
        }
    }
    
}
