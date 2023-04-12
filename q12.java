import java.util.*;
public class q12 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n= a.nextInt();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int x=0;
        for (int i=0; i<10;i++){
            
            if (arr[i]==n){
                x =1;
                break;
            }

        }
        if(x==1){
            System.out.println("found the number :"+ n);

        }
        else{
            System.out.println("found the number not");
            
        }
    }
    
}
