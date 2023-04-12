import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ratinmaze { 
    public static void path (ArrayList<String> ans,int [][]m , int n,int i ,int j,String Dir){
        if(i==n-1 && j==n-1){
            ans.add(Dir);
            return;
        }
        if(i>=0 && j>=0 && i<n && j<n && m[i][j]==1){
            m[i][j]=0;
            path( ans,m, n, i+1, j, Dir+"D");
            path( ans,m, n, i, j+1, Dir+"R");
            path( ans,m, n, i-1, j, Dir+"U");
            path( ans,m, n, i, j-1, Dir+"L");
            m[i][j]=1;
        }
        else{
            return;
        }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans  =new ArrayList<>();
        // Your code here
        if(m[n-1][n-1]==0){
            return ans;
        }
       Set<String> setans = new HashSet<String> ();
        setans.addAll(ans);
        ans.clear();
        ans.addAll(setans);
        path(ans,m, n, 0, 0,"");
        return ans;
    }
}
