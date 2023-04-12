import java.util.*;
interface spatial{

}
abstract class shape{ 
    abstract double area();
    abstract double volume();
}
class rectangle extends shape{
    int length;
    int breadth;
    rectangle(int length ,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double area(){
        double a=length*breadth;
        return a;                                                                                                                         
    }
    double volume(){
        double volume=-1 ;
        return (volume);
    }
}
class triangle extends shape{
    int base;
    int height;
    triangle(int base ,int height){
        this.base=base;
        this.height=height;
    }
    double area(){
        double area=(double)base*height/2;
        return area ;                                                                                                                         
    }
    double volume(){
        double volume=-1;
        return volume ;
    }
}
class cube extends shape implements spatial{
    int side;
    cube(int side){
        this.side=side;
    }
    double area(){
        double area=6*side*side;
        return (area);                                                                                                                         
    }
    double volume(){
        double volume=side*side*side;
        return volume ;
    }
}
class sphere extends shape implements spatial{
    int radius;
    sphere(int radius){
       this.radius= radius;
    }
    double area(){
        double area =(double)4*Math.PI*radius*radius;
        return (area);                                                                                                                         
    }
    
    double volume(){
        return (double)(4*Math.PI*radius*radius*radius)/3;    
    }
}
public class q25 {
    public static void main(String[] args) {
        
        shape a[]=new shape[5];
        for(int i=0; i<5;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the type of obj : "+ i );
            String m= sc.nextLine();
            if(m.compareTo("rectangle")==0){
                int l=sc.nextInt();
                int b=sc.nextInt();
                a[i]=new rectangle(l,b);
                System.out.println();
            }
            else if(m.compareTo("triangle")==0){
                int l=sc.nextInt();
                int b=sc.nextInt();
                System.out.println();
                a[i]=new triangle(l,b);
            }
            else if(m.compareTo("cube")==0){
                int l=sc.nextInt();
                System.out.println();
                a[i]=new cube(l);
            }
            else if(m.compareTo("sphere")==0){
                int l=sc.nextInt();
                System.out.println();
                a[i]=new sphere(l);
            }
            else{
                System.out.println("enter correct number");
                i--;
            }
        }
        for(int i=0; i<5;i++){
            System.out.println(a[i].area());
            if (a[i].volume()!=-1){
                System.out.println(a[i].volume());
            }
        }     
    }

  
}
