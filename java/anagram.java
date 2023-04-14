import java.util.*;
public class anagram {
    void check(String a, String b){
        StringBuffer e= new StringBuffer(a.toLowerCase());
        StringBuffer f= new StringBuffer(b.toLowerCase());
        for (int i=0;i<e.length();i++){
            if (e.charAt(i)==' '){
                e.deleteCharAt(i);
                i--;
            }
        }
        for (int i=0;i<f.length();i++){
            if (f.charAt(i)==' '){
                f.deleteCharAt(i);
                i--;
            }
        }
        int c=e.length();
        int d=f.length();
        char y[]=new char[e.length()];
        char z[]=new char[e.length()];
        int arr[]=new int [e.length()];
        int flag=0;
        if (c==d){
            for (int i=0; i<e.length();i++){
                    y[i]=e.charAt(i);
            }
            for (int i=0; i<e.length();i++){
                    z[i]=f.charAt(i);
            }
            for (int i=0; i<e.length();i++){
                for (int j=0; j<e.length();j++){
                    if (y[i]==z[j]){
                        arr[i]=1;
                        break;
                    }
                }
            }
            for (int i=0;i<e.length();i++){
                if(arr[i]!=1){
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println("anagram");
            }
            else{
                System.out.println("not anagram");
            }
        }
        else{
            System.out.println("not anagram");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter no. 1 : ");
        String a= sc.nextLine();
        System.out.println("enter no. 2 : ");
        String b= sc.nextLine();
        anagram obj = new anagram();
        obj.check(a,b);
    }
    
}
