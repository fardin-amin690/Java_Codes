package practicefile;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a,b;
        System.out.print("enter any number : ");
        a = input.nextFloat();
         System.out.print("enter another number : ");
        b = input.nextFloat();
         float r = Math.max(a, b);
        System.out.println(("Max num = "+r));
         float c = Math.min(a, b);
        System.out.println("Min num = "+c);
        
      }
    }
