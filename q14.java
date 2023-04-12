import java.util.*;
public class q14 {
    public void equal(int a[][],int b[][]){
        int z=1;
        for (int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                if (a[i][j]==b[i][j]){
                    continue;
                }
                else{
                    z=0;
                    System.out.println("unequal number are:"+a[i][j]+" and"+b[i][j]);
                }
            }
        }

                if (z==1){
                    System.out.print("equal array");
                }
                else{
                    System.out.print("unequal array");
                }
            
        

    }

    public static void main(String[] args) {
        int arr[][]= new int[3][3];
        int brr[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                brr[i][j]=sc.nextInt();
            }
        }
        q14 obj = new q14();
        obj.equal(arr,brr);
    }   
}
