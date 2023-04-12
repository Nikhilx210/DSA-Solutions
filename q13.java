import java.util.*;
public class q13 {

    public void sort(String a[]){
        
            for (int i=0; i<10;i++){
                for(int j=0; j<10; j++){
                    if (a[i].length() >a[j].length()){
                        String p= a[j];
                        a[j]= a[i];
                        a[i]= p;
                    }
                    else if(a[i].length() <=a[j].length()){
                        continue;
                    }
                    
                }
            }
            for (int i =0;i<10;i++){
                System.out.println(a[2]);
            }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[]= new String[10];
        for (int i=0; i<10;i++){
            arr[i]= sc.next();
        }
        q13 obj = new q13();
        obj.sort(arr);

        
    }
    
}
