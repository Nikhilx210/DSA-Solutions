import java.util.StringTokenizer;
public class q27 {
    void Stringtokenizer(String a, char b){
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)==b){
                System.out.println();
            }
            else if(a.charAt(i)==' '){
                continue;
            }
            else{
                System.out.print(a.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        String a="the% quick% brown% fox %jumps %over% the% lazy% dog";
        q27 b= new q27();
        b.Stringtokenizer(a, '%');
        
    }
    
}
