import java.util.*;

public class spiralmatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row =matrix.length;
        int col =matrix[0].length;
        int siz=col*row;
        List<Integer> ans =new ArrayList<Integer>();
        int i=0;
        while(siz>0){
            int a =0;
            int b =0;
            while(a<col && siz>0){
                ans.add(matrix[b+i][a+i]);
                a++;
                siz--;
            }
            a=col-1;
            b++;
            while(b<row && siz>0){
                ans.add(matrix[b+i][a+i]);
                b++;
                siz--;
            }
            b = row-1;
            a--;
            while(a>=0 && siz>0){
                ans.add(matrix[b+i][a+i]);
                a--;
                siz--;
            }
            a++;
            b--;
            while(b>0 && siz>0){
                ans.add(matrix[b+i][a+i]);
                b--;
                siz--;
            }
            col-=2;
            row-=2;
            i++;
        }
        return ans;   
    }
}
