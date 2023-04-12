import java.util.*;
public class q8 {
    int fact (int c) {    
        if (c==1){
            return 1;
        }
        return c * fact(c-1);
        
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter the number:");
        int b = a.nextInt();
        q8 m = new q8() ;
        int z = m.fact(b);
        System.out.println(z);
    }    
}
