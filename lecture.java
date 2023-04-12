import java.io.*;
public class lecture {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream("abc.txt")); 
            
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        
        System.out.println("hello");
    }
    
}
