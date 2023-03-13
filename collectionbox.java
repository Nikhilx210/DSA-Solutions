class currency{
    double totalmoney;
    int notes;
    int coins;
    currency(int notes ,int coins){
        this.notes= notes;
        this.coins=coins;
    }
}
class dollar extends currency{
    dollar(int notes ,int coins){
        super(notes,coins);
    }
    double compute(){
        totalmoney=50*notes+(50*coins)/100;
        return totalmoney;
    }
    void print(){
        System.out.println("totalmoney");
    }
}
class pound extends currency{
    pound (int notes ,int coins){
        super(notes,coins);
    }
    double compute(){
        totalmoney=(50*1.6232*notes)+((50*1.6232*coins)/100);
        return totalmoney;
    }
    void print(){
        System.out.println("totalmoney");
    }
}
class rupee extends currency{
    rupee(int notes ,int coins){
        super(notes,coins);
    }
    double compute(){
        totalmoney=1*notes+((1*coins)/100);
        return totalmoney;
    }
    void print(){
        System.out.println("totalmoney");
    }
}

public class collectionbox {
    void display(dollar a,dollar b,pound c,rupee d){
        System.out.println(a.compute()+b.compute()+c.compute()+d.compute());   
    }

    public static void main(String[] args) {
        dollar charity1 = new dollar(5,5);
        dollar charity2 = new dollar(56,65);
        pound charity3 = new pound(25,15);
        rupee charity4 = new rupee(10,10);
        collectionbox a=new collectionbox();
        a.display(charity1,charity2,charity3,charity4);
           
    }

}

