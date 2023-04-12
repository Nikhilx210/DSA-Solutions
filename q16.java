import java.util.*;
public class q16 {
    void print(int a[]){
        for (int i=0; i<3;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    void print (String a[]){
        for (int i=0; i<3;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    void print (Double a[]){
        for (int i=0; i<3;i++){
            System.out.print(a[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [3];
        String brr[] = new String [3];
        Double crr[]= new Double[3];
        for (int i=0; i<3;i++){
            arr[i]=sc.nextInt();
            brr[i]=sc.next();
            crr[i]=sc.nextDouble();

        }
        q16 obj =new q16();
        obj.print(arr); 
        obj.print(brr);
        obj.print(crr);        


    }    
}
