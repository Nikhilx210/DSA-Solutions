class marks {
    int reg;
    int marksineng;
    int marksinmaths;
    int marksinscience;
    String name;
    String get(){
        return name;
    }
    int get1(){
        return reg;
    }
    int get2(){
        return marksineng;
    }
    int get3(){
        return marksinmaths;
    }
    int get4(){
        return marksinscience;
    }
    void set1(String name){
        this.name=name;
    }
    void set(int regnum){
        reg=regnum;   
    }
    void seteng(int a){
        marksineng=a;   
    }
    void setmath(int b){
        marksinmaths=b;   
    }
    void setsci(int c){
        marksinscience=c;   
    }
}

public class student{
    void ascend(marks a,marks b, marks c){
        marks arr []={a,b,c};       
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i].get1()<arr[j].get1()){
                    marks z=arr[i];
                    arr[i]=arr[j];
                    arr[j]=z;
                }
                else{
                    continue;
                }
            }
        }
        for (int i=0;i<3;i++){
            System.out.println("roll no.: "+arr[i].get1()+"name : "+arr[i].get());
        }
    }
    void percentage(marks a,marks b,marks c){
        int x=((a.get2()+a.get3()+a.get4())/3);
        int y=((b.get2()+b.get3()+b.get4())/3);
        int z=((c.get2()+c.get3()+c.get4())/3);
        int max=0;
        int arr[]={x,y,z};
        for (int i=0;i<3;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            else{
                continue;
            }
        }
        
            if (max==x){

                System.out.println("roll no. : " + a.get1());
                System.out.println("topper name : " + a.get());
            }
            else if (max==y){
                System.out.println("roll no. : " + b.get1());
                System.out.println("topper name : " + b.get());
            }
            else if(max==z){
                System.out.println("roll no. : " + c.get1());
                System.out.println(" topper name : " + c.get());
            } 
    }
    void mathstop(marks a ,marks b ,marks c){
        int x= a.get3();
        int y= a.get3();
        int z= a.get3();
        int arr[] ={a.get3(),b.get3(),c.get3()};
        
        int max=0;
        
        for (int i=0;i<3;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            else{
                continue;
            }
        }
        
            if (max==x){

                System.out.println("roll no. : " + a.get1());
                System.out.println("math topper name : " + a.get());
            }
            else if (max==y){
                System.out.println("roll no. : " + b.get1());
                System.out.println("math topper name : " + b.get());
            }
            else if(max==z){
                System.out.println("roll no. : " + c.get1());
                System.out.println("math topper name : " + c.get());
            }     
    }
    void twosub (marks a ,marks b,  marks c) {
        marks arr []={a,b,c};       
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((arr[i].get3()+arr[i].get4())<(arr[j].get3()+arr[i].get4())){
                    marks z=arr[i];
                    arr[i]=arr[j];
                    arr[j]=z;
                }
                else{
                    continue;
                }
            }
        }
        for (int i=0;i<3;i++){
            System.out.println("roll no.: "+arr[i].get1()+" and name : "+arr[i].get());
        }
    }
    void rank(marks a ,marks b,  marks c){
        marks arr []={a,b,c};
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((arr[i].get3()+arr[i].get4()+arr[i].get2())>(arr[j].get3()+arr[j].get4()+arr[j].get2())){
                    marks z=arr[i];
                    arr[i]=arr[j];
                    arr[j]=z;
                }
                else{
                    continue;
                }
            }
        }
        for (int i=2;i>=0;i--){
            System.out.println("roll no.: "+arr[i].get1()+" and name : "+arr[i].get()+" total marks "+(arr[i].get3()+arr[i].get4()+arr[i].get2())+" rank :"+(i+1)+" percent "+((arr[i].get2()+arr[i].get3()+arr[i].get4())/3)+"%");
        } 


    }
    public static void main(String[] args) {
        marks s1 = new marks();
        s1.set1("jai");
        s1.set(1);
        s1.seteng(100);
        s1.setmath(98);
        s1.setsci(95);
        marks s2=new marks();
        s2.set1("chavvi");
        s2.set(2);
        s2.seteng(92);
        s2.setmath(90);
        s2.setsci(17);
        marks s3=new marks();
        s3.set1("baby");
        s3.set(3);
        s3.seteng(12);
        s3.setmath(10);
        s3.setsci(100);
        student obj = new student();
        obj.ascend(s1,s2,s3);
        System.out.println();
        obj.percentage(s1,s2,s3);
        System.out.println();
        obj.mathstop(s1,s2,s3);
        obj.twosub(s1,s2,s3);
        obj.rank(s1,s2,s3);
    }
}

