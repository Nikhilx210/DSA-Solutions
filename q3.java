import java.util.*;
public class q3 {
    public static void main(String[] args) {
        System.out.print("enter product code :");
        Scanner sc=new Scanner(System.in);
        String p = sc.nextLine();
        System.out.print("enter product quantity :");
        int q = sc.nextInt();
        switch (p) {
            case "A":
            
            System.out.println("total value of product sold :"+ 22.50*q);
            break;
            case "B":

            System.out.println("total value of product sold :"+ 44.50*q);
            break;
            case ("C"):
            
            System.out.println("total value of product sold :"+ 9.98*q);
            break;


        }

    }
    
}
