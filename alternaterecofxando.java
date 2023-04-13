import java.util.*;

public class alternaterecofxando {
    public static char[][] xando(int m, int n) {
        char [][] ans = new char[m][n];
        int row =m;
        int col =n;
        int siz=col*row;
        int i=0;
        int flipper =0;
        char alpha='X';
        while(siz>0){
            if(flipper==0){
                alpha ='X';
                flipper=1;
            }
            else{
                alpha='O';
                flipper=0;
            }
            int a =0;
            int b =0;
            while(a<col && siz>0){
                ans[b+i][a+i]= alpha;
                a++;
                siz--;
            }
            a=col-1;
            b++;
            while(b<row && siz>0){
                ans[b+i][a+i]= alpha;
                b++;
                siz--;
            }
            b = row-1;
            a--;
            while(a>=0 && siz>0){
                ans[b+i][a+i]= alpha;
                a--;
                siz--;
            }
            a++;
            b--;
            while(b>0 && siz>0){
                ans[b+i][a+i]= alpha;
                b--;
                siz--;
            }
            col-=2;
            row-=2;
            i++;
        }   
        return ans;
    }
    public static void main(String[] args) {
        int a =6;
        int b= 7;
        char [][] ans = new char[a][b];
        ans=xando(a, b);
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    
}
