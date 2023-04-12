import java.util.*;
class q18 {
    private int balance;
    int get(){
        return balance;
    }
    void set(int balance){
        this.balance=balance;
    }
    void deposit (int amt){
        balance=balance+amt;
        
    }
    void withdraw(int amt){
        if (balance>amt){
            balance= balance-amt;
        }
        else{
            System.out.println("insufficient funds");
        }
        
    }
}
public class testaccount {
    public static void main(String[] args) {
        q18 obj= new q18();
        obj.set(2000);
        obj.deposit(500);
        obj.withdraw(1800);
        System.out.println(obj.get());
    }
}
