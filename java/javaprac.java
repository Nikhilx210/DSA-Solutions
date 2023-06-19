import java.util.*;
public class javaprac{
    public static void main(String[] args) {
        int n=2;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        while(n>0){
            try{
                System.out.print("Enter the no : ");
                sum+=sc.nextInt();
                n--;
            }
            catch(Exception ec){
                System.out.println("Enter valid input");
            }
            sc.nextLine();
        }
        System.out.println("SUM OF THE NO = "+sum);
    }
}
    

