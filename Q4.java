import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter number of eggs :");
        int n = a.nextInt();
        int g = n/144 ;
        int d = (n%144)/12;
        int e = ((n%144)%12);
        System.out.println("number of eggs is : "+ g + " gross "+ d +" dozen and "+ e + "eggs");
    }
    
}
