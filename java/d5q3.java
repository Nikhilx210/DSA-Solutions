class worker{
    int pay;
    String name; int salary;
    worker(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    
}
class dailyworker extends worker{
    
    int day;
    int pay;
    dailyworker(String name, int salary,int day){
        super(name,salary);
        if (day  > 7){
            System.out.println("enter correct days");
        }else{
            this.day=day;
        }
        
    }
    String naam(){
        return name;
    }
    int pay(){
        return pay=salary*day;   
    }
    void details(){
        System.out.println(name+" "+pay+" d");
    }

}
class salariedworker extends worker{
    int hours;
    int pay;
    salariedworker(String name, int salary,int hours){
        super(name,salary);
            this.hours=hours;
        
    }
    int pay(){
        if (hours<=40){
            return pay=salary*hours;
        }
        else{
            return pay =salary*40;
        }
         
    }
    String naam(){
        return name;
    }
    void details(){
        System.out.println(name+" "+pay+" w");
    }
}
public class d5q3{
    public static void main(String[] args) {
        salariedworker a= new salariedworker("pra", 10000, 35);
        salariedworker b= new salariedworker("nik", 1000, 39);
        dailyworker c=new dailyworker("nik", 6969, 5);   
        dailyworker d=new dailyworker("apru", 60009, 7); 
        dailyworker e=new dailyworker("apru", 609, 2);
        worker arr[]={a,b,c,d,e};            
        for (int i=0; i<4;i++){
            for(int j=0; j<4; j++){
                if (arr[i].pay > arr[j].pay){
                    worker p= arr[j];
                    arr[j]= arr[i];
                    arr[i]= p;
                }
            }
        }
        int arr1[]=new int[5];
        for (int i=0; i<5;i++){
            for(int j=i+1; j<5; j++){
                if(arr[i].name == arr[j].name){
                    arr1[i]=1;
                }
                else{
                    continue;
                }
            }
        }
        for (int i=0; i<5;i++){
            if(arr1[i]==0){
                System.out.println(arr[i].name);
            }
            else{
                continue;
            }
        }

    }

}




