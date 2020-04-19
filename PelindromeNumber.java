package pelindromenumber;

import java.util.Scanner;

public class PelindromeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,temp = 1,original,rem;
        
        System.out.println("enter any number :");
        n = input.nextInt();
        
        
        original = n;
        while(n!=0)
        {
            rem = n%10;
            temp = temp*10+rem;
            n/=10;
        }
        if(original==temp){
            System.out.println("The number is a pelindrome");
            
        }
        else{
            System.out.println("The number is not pelindrome");
        }
                
      
    }
    
}
