import java.time.Year;
import java.time.YearMonth;
import java.util.*;
public class javaalacalender {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int x= sc.nextInt();
        Calendar a= Calendar.getInstance();
        System.out.println(a.get(Calendar.YEAR)-x);
        System.out.println(a.get(Calendar.DATE)-x);
        System.out.println(a.get(Calendar.HOUR)-x);
        System.out.println(a.get(Calendar.MONTH)-x);
        a.add(Calendar.YEAR,-x);
        a.add(Calendar.DATE,-x);
        a.add(Calendar.HOUR,-x);
        a.add(Calendar.MONTH,-x);
        System.out.println(a.getTime());
    }
}
