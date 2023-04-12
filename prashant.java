import java.util.*;
public class prashant {
        public void sum (int m [][] ,int  n [][] , int p, int q, int r , int s){
            if (p==r && q==s){ 
                int crr[][]= new int [p][q];
                for (int i=0; i<p;i++){
                    for(int j=0; j<q; j++){
                        int element= m[i][j] + n[i][j];
                        crr[i][j] = element;
                    }
                }
                for (int i=0; i<p;i++){
                    for(int j=0; j<q; j++){
                        System.out.print(crr[i][j]+" ");
                    }
                    System.out.println();
                }           
            }
            
            
            
        }
    
    
        public static void main(String[] args) {
            System.out.println("enter the size of matrix 1 row :");
            Scanner a = new Scanner(System.in);
            int b = a.nextInt();
            System.out.println("enter the size of matrix 1 breadth :");
            
            int c = a.nextInt();
            System.out.println("enter the size of matrix 2 row :");
            
            int d = a.nextInt();
            System.out.println("enter the size of matrix 2 breadth :");
            
            int e = a.nextInt();
            int arr [][]= new int [b][c];
            for (int i=0; i<b;i++){
                for(int j=0; j<c; j++){
                    int z= a.nextInt();
                    arr[i][j] =z;
                }
            }
            int brr [][]= new int [d][e];
            for (int i=0; i<d;i++){
                for(int j=0; j<e; j++){
                    int z= a.nextInt();
                    brr[i][j] =z;
                }
            }
            prashant obj = new prashant();
            obj.sum(arr, brr,b,c,d,e);            
        }
        
        
}
