package practicefile;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers : ");
        
        double sum = 0;
        double[] num = new double[5];
        for (int i = 0; i < num.length ; i++) {
            num[i]= input.nextInt();  
        
        }
          
        for (int i = 0; i < num.length; i++) {
           sum = sum + num[i];
            
        }      
         System.out.println("");
        System.out.println("Sum = "+sum);
        int len = num.length;
        System.out.println("Lenght of array = "+len);
        double max = num[0];
        for (int i = 0; i < 5; i++) {
            if(max<num[i]){
                max = num[i];
            }
           
            
        }
         System.out.println("Max : "+max);
         
    }
    
}
