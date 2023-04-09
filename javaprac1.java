import java.util.*;
public class javaprac1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuffer ap=new StringBuffer(sc.nextLine());
        StringBuffer np=new StringBuffer(sc.nextLine());
        for(int i=0;i<ap.length();i++){
            char ans=ap.charAt(i);
            if(!(ans>='a' && ans<='z') && !(ans>='A' && ans<='Z')){
               ap.delete(i,i+1);
               i--;
            }else if(ans>='A' && ans<='Z'){
                ap.setCharAt(i, Character.toLowerCase(ans));
            }
            
        }
        for(int i=0;i<np.length();i++){
            char ans=np.charAt(i);
            if(!(ans>='a' && ans<='z') && !(ans>='A' && ans<='Z')){
               np.delete(i,i+1);
               i--;
            }else if(ans>='A' && ans<='Z'){
                np.setCharAt(i,Character.toLowerCase(ans));
            }
        }
        System.out.println(ap);
        System.out.println(np);
        boolean flag=false;
        for(int i=0;i<ap.length();i++){
            flag=false;
            for(int j=0;j<np.length();j++){
                if(ap.charAt(i)==np.charAt(j)){
                    flag=true;
                }
            }
            if(flag==false){
                System.out.println("Gven strings are not anagram ");
                break;
            }
        }
        if(flag){
            System.out.println("Given string are anagram");
        }
    }
}

