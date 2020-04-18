package practicefile;

public class JumpStatement {
    public static void main(String[] args) {
        for(int a=0; a<=20; a++){
            if(a<=10){
                continue;
            }
            if(a>13){
                break;
            }
            System.out.println(a+". Ayan");
                
        }
    }
    
}
