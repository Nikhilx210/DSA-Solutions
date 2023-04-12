import java.lang.*;
public class q7 {
    public static void main(String[] args) {
        
        for (int i = 2 ; i <=100;i ++  ){
            int r = 0;
            for (int j =2  ; j <= Math.sqrt(i) ; j++){
                if (i%j==0){
                    r =1;
                    break;
                        
                }

            }
            if (r==0){
                System.out.println(i);
                System.out.println(Math.cbrt(i));
            }
            
        
        }
    }

    
}
