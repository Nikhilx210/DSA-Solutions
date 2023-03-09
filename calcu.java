import java.util.*;
public class calcu {
    void method(){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the operation");
        
        String op =sc.nextLine();
        double arr[]=new double[2];
        int z=1;
        while(z<3){
            Scanner sc1= new Scanner(System.in);
            try { 
                System.out.println("enter no."+z);
                arr[z-1]= sc1.nextDouble();
                z++;
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("enter correct no.");
            }
        }
        if(op.compareTo("+")==0){
            double sum= arr[0]+arr[1];
            System.out.println("sum is : "+sum);
        }
        else if(op.compareTo("-")==0){
            double diff= arr[0]-arr[1];
            System.out.println("difference is : "+diff);
        }
        else if(op.compareTo("*")==0){
            double pro= (double)arr[0]*arr[1];
            System.out.println("product is : "+pro);
        }
        else if(op.compareTo("/")==0){
            if(arr[1]==0){
                System.out.println("div by 0 not posssible");
            }
            else{
                double div=(double) arr[0]/arr[1];
                System.out.println("division is : "+div);
            }
        }
        else{
            System.out.println("enter correct operation");
            calcu obj1= new calcu();
            obj1.method();
        }
    }
    public static void main(String[] args) {
        calcu obj= new calcu();
        obj.method();
    }
}
