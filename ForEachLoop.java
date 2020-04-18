package practicefile;
public class ForEachLoop {
    public static void main(String[] args) {
        int s = 0;
        int[] num = {10, 22, 20, 5, 15, 8, 10, 2, 5 , 3};
        for(int x : num){  
            s = s + x;
            
            System.out.println(" "+x);
          
        }
        System.out.println("Sum = "+s);
        System.out.println("Length = "+num.length);
         
    }
    
}
