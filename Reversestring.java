
package reversestring;
import java.util.Scanner;

public class Reversestring {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, r = "";
        System.out.print("Enter any word :");
        a = input.nextLine();
        for(int i = a.length()-1; i >= 0; i--){
            r = r + a.charAt(i);
        }
        System.out.println("Reverse is :"+r);
       
    }
    
}
