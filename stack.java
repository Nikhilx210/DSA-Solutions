import java.util.*;
public class stack {

    public static void main(String[] args) {
        System.out.print("enter the size of array :");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        
        int []arr = new int [b];
        for (int i=0; i<b ; i ++){
            arr[i] = a.nextInt();
        }
        System.out.print("enter function to be used:");
        Scanner sc = new Scanner(System.in);
        String fun = sc.nextLine();
        if (fun.compareTo("push")==0){
            int brr[]= new int [b+1];
            for (int i=0; i<b+1 ; i ++){
                brr[i] = arr[i] ;
                brr[i+1]= a.nextInt();
                break;
            }
            for (int i=0; i<b+1 ; i ++) {      
            System.out.print(brr[i]+" ");
            }
        }
        else if(fun.compareTo("pop")== 0 ){
            int crr[]= new int [b-1];
            for (int i=0; i<b-1 ; i ++){
                crr[i] = arr[i];    
            }
            for (int i=0; i<b+1 ; i ++) {      
            System.out.print(crr[i]+" ");
            }

        }
        else{
            System.out.println("enter correct function ");    
        }
        for (int i=0; i<b ; i ++) {      
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
