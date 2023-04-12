import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;
    
    public class Solution {
    
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            for (int i=0;i<b;i++){
                if(sc.hasNext()){
                    String a = sc.nextLine();
                    System.out.println(i+" "+a);                
                }
    
            }
        }
    }
    

