import java.util.*;
public class fivemember {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    int arr[]=new int[5];
    int c =0;
    while(c<5){    
        try{
            System.out.println("enter number "+c);
            arr[c]=sc.nextInt();
            c++;
        }
        catch(Exception ex){
            System.out.println("enter correct no.");
        }
        sc.nextLine();
    
    }
    for (int i=0;i<5;i++){
        System.out.print(arr[i]+" ");

    }
}   
}
