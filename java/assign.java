import java.util.*;

class assign{

public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    if  (a %400==0){
    
            System.out.println("it is a leap year") ;}
        
    else{
         if ((a % 4==0)&(a%100!=0)){
            System.out.println("it is a leap year") ;}
        else{
            System.out.println("it is not a leap year")  ;}
        
        }

    }
}