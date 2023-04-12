import java.util.*;
    class vechile{
        String colour;
        int  wheels;
        String model;
        vechile(String colour,int wheels,String model){
            this.colour=colour;
            this.wheels=wheels;
            this.model=model;
        }
        void c1(){
            System.out.println(colour);
        }
        void c2(){
            System.out.println(wheels);
        }
        void c3(){
            System.out.println(model);
        }
    }
    class truck extends vechile{
        String capacity;
        truck(String colour,int wheels,String model,String capacity){
            super(colour,wheels,model);
            this.capacity=capacity;
        }
    
        void detailtruck(){
            System.out.println(colour+" "+wheels +" " +model+" "+capacity);
        }
    } 
    class bus extends vechile{
        String pass;
        bus(String colour,int wheels,String model,String pass){
            super(colour,wheels,model);
            this.pass=pass;
        }
        void detailbus(){
            System.out.println(colour+" "+wheels +" " +model+" "+pass);
        }
    }
    public class road {
        public static void main(String[] args) {
            truck a1=new truck("RED",16,"2011","1600L");
            truck a2=new truck("BLUE",16,"2012","160L");
            bus a3=new bus("Black",10,"2012","16");
            bus a4=new bus("prashantrand",1,"2002","10");
            a1.detailtruck();
            a2.detailtruck();
            a3.detailbus();
            a4.detailbus();
        }   
    }
    

