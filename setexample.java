import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class setexample {

    public static void main(String[] args) {
        ArrayList<String> ans  =new ArrayList<>();
        Set<String> setans = new HashSet<String> ();
        ans.add(0,"azzz");
        ans.add(1,"azzz");
        ans.add(2,"b");
        ans.add(3,"b");
        ans.add(4,"c");
        for(String i : ans){
            System.out.print(i);
        }
        System.out.println();
        setans.addAll(ans);
        for(String i : setans){
            System.out.print(i);
        }
        System.out.println();
        ans.clear();
        ans.add("ddska");
        for(String i : ans){
            System.out.print(i);
        }
        System.out.println();
        ans.addAll(setans);
        for(String i : ans.subList(0, 2)){
            System.out.print(i);
        }
        System.out.println();
        Collections.sort(ans);
        for(String i : ans){
            System.out.print(i);
        }
    }
}
