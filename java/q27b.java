import java.util.StringTokenizer;

public class q27b {
    public static void main(String[] args) {
        String a="the% quick% brown% fox %jumps %over% the% lazy% dog";
        StringTokenizer b= new StringTokenizer(a,"%");
        while(b.hasMoreTokens())
            System.out.println(b.nextToken());
    }
    
}
