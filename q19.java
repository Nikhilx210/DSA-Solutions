import java.util.*;
public class q19 {
    void add(int a ,int b){
        System.out.println("sum is : ");
        System.out.println(a+b);
    }
    void add(double a ,double b){
        System.out.println("sum is : ");
        System.out.println(a+b);
    }
    void add(double a ,int b){
        System.out.println("sum is : ");
        System.out.println(a+b);
    }
    void add(int a ,double b){
        System.out.println("sum is : ");
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        q19 obj = new q19();
        obj.add(sc.nextInt(),sc.nextInt());
        obj.add(sc.nextDouble(),sc.nextDouble());
        obj.add(sc.nextInt(),sc.nextDouble());
        obj.add(sc.nextDouble(),sc.nextInt());         
    }
    
}
