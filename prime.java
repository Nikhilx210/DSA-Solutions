import java.util.*;
import java.lang.*;
public class prime {
    public static void main(String[] args) {
        
    
    Scanner a= new Scanner (System.in);
    int b= a.nextInt();
    int r = 0;
    for (int i =2  ; i <= Math.sqrt(b) ; i++){
        if (b%i==0){
             r = 1;
            break;
            
        }
       
    }
    if (r == 0 ){
        System.out.println("prime");


    }
    else {
        System.out.println(" not prime");

    }

    }
}
