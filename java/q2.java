import java.util.*;
public class q2 {
    public static void main(String[] args) {
    System.out.println("enter category");
    Scanner sc = new Scanner(System.in) ; 
    System.out.println("enter salary");
    Scanner cs = new Scanner(System.in) ;
    int a = sc.nextInt();
    int b = cs.nextInt();
    if( a == 0){
        if (b >=0 & b<=180000){
              System.out.println("no tax");
          }
        else if(b>=180001 & b<=500000 ){
              System.out.println("10%");
          }
        else if (b>=500001){
            System.out.println("20%");
        }
    }
    else if(a== 100){
        if (b >=0 & b<=190000){
            System.out.println("no tax");
        }
      else if(b>=190001 & b<=500000 ){
            System.out.println("10%");
        }
      else if (b>=500001){
          System.out.println("20%");
      }
    }
    else {
        System.out.println("no match");
    }

      
    }

    
}
