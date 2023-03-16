import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class commonelementrow {
    public static int findcommonelement(int a[][]){
        int row = a.length;
        int col =a[0].length;
        int ans[] = new int [row];
        Hashtable<Integer,List<Integer>> h = new Hashtable<>();
        int mainrow =-1;
        int maxcol0 = 0 ;
        int mincollst =Integer.MAX_VALUE;
        for (int i=0;i<row;i++){
            if(maxcol0<a[i][0]){
                mainrow = i;  
            }
            maxcol0=Integer.max(maxcol0, a[i][0]); 
            mincollst=Integer.min(mincollst, a[i][col-1]);
        }
        if(mincollst<maxcol0){
            return -1;
        }
        for(int i=0;i<col;i++){
            if(a[mainrow][i]>=maxcol0 && a[mainrow][i]<=mincollst  ){
                List<Integer> l= new ArrayList<>();
                l.add(-1);
                h.put(a[mainrow][i],l);
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(h.containsKey(a[i][j])){
                    List<Integer> l= new ArrayList<>();
                    l = h.get(a[i][j]);
                    l.add(i);
                    h.put(a[i][j],l);
                }
            }
        }
        for(int i=0;i<col;i++){
            if(h.containsKey(a[mainrow][i])){
                List<Integer> l= new ArrayList<>();
                l = h.get(a[mainrow][i]);
                if(l.size()>=row){
                    int count=-1;
                    for(int j=0;j<l.size();j++){
                        if(l.get(j)==count){
                            count++;
                        }   
                    }
                    if(count==row){
                        return a[mainrow][i];
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        char M[][] = new char[][] { { '1', '1', '0', '1', '1' },
                                  { '0', '1', '1', '0', '0' },
                                  { '1', '0', '0', '0', '1' },
                                  { '0', '0', '0', '0', '0' },
                                  { '1', '0', '1', '0', '1' } };
        int M1[][] = new int[][]{ {1, 2, 3, 4, 5},
        {2, 4, 5, 8, 10},
        {3, 5, 7, 9, 11},
        {1, 3, 5, 7, 9}
      };
        System.out.println(findcommonelement(M1));
        
    }
}
