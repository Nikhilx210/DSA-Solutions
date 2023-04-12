
import java.util.*;
public class q11 {
    public static void main(String[] args) {
        int arr[] =new int[10];
        Scanner a = new Scanner(System.in);
        for (int i=0; i<10;i++){
            int b = a.nextInt();
            arr[i] =  b;
            
        }
        int max = 0;
        int min = 100000;
        for (int i=0; i<10;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        for (int i=0; i<10;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
    
    
}
