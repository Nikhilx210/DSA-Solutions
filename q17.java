import java.util.*;
import java.lang.*; 
public class q17 {
    void area (int a,int b){
        System.out.println("length of rec is :"+ a);
        System.out.println("breadth of rec is :"+ b);
        int c=a*b;
        System.out.println("area is:"+c);
    }
    void area (int a,int b ,int c){
        System.out.println("side 1 of triangle  is :"+ a);
        System.out.println("side 2 of triangle is :"+ b);
        System.out.println("side 3 of triangle is :"+ c);
        int s=(a+b+c)/2;
        Double d=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area is:"+d);
    }
    void area (int r){
        System.out.println("radius of the circle is:"+r);
        double a = 2*Math.PI*r;
        System.out.println("area is:"+a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e= sc.nextInt();
        int f= sc.nextInt();
        q17 obj = new q17();
        obj.area(a,b);
        obj.area(c,d,e);
        obj.area(f);
    }

}
