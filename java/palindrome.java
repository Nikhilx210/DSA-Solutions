import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c=b;
        int r=0;
        while(b>0){
            r=r*10+b%10;
            b=b/10;

        }
        if (c == r) {
            System.out.println("palindrome number");


        }
        else{
            System.out.println(" not palindrome number");

        }
        




        
    }
    
}
