
public class addressbook {
    String name;
    private class address{
        String street;
        String city;
        String state;
        String get(){
            return name;
        }
        void set(String a){
            name=a;
        }
        void set1(String a){
            street=a;
        }
        void set2(String a){
            city=a;
        }
        String get1(){
            return street;
        }
        String get2(){
            return city;
        }
        String get3(){
            return state;
        }
        void set3(String a){
            state=a;
        }  
    }
    address tempadd=new address();
    address premadd=new address();
    long phoneno;
    String get(){
        return name;
    }
    void set(String a){
        name=a;
    }

    long getno(){
        return phoneno;
    }

    void setno(long a){
        phoneno=a;
    }
    public static void main(String[] args) {
        addressbook obj = new addressbook();
        obj.premadd.set("jai");
        obj.premadd.set1("devru road");
        obj.premadd.set2("sonepat");
        obj.premadd.set3("haryana");
        obj.tempadd.set("jai");
        obj.tempadd.set1("clg street");
        obj.tempadd.set2("neemrana");
        obj.tempadd.set3("rajasthan");
        obj.setno(9999999);
        obj.set("jai");
        System.out.println(        obj.premadd.get()+ "                          "+
        obj.premadd.get1()+ "                          "+
        obj.premadd.get2()+ "                          "+
        obj.premadd.get3()+ "                          "+
        obj.tempadd.get()+ "                          "+
        obj.tempadd.get1()+ "                          "+
        obj.tempadd.get2()+ "                          "+
        obj.tempadd.get3()+ "                          "+
        obj.getno()+ "                          "+
        obj.get());
        
    }



    
    
}
