public class lllongestpossiblepath {
    public static int bestpath(int[][] mat,int n,int m,int xs,int ys,int xd,int yd,int ans){
        if(xs<0 || ys<0 || xs>=n || ys>=m ){
            return 0;
        }
        else if(mat[xs][ys]==0){
            return ans-1;
        }
        else{
                if(xs==xd && ys==yd){
                return ans;
            }
            else{
                mat[xs][ys]=0;
                int a3=bestpath(mat, n, m, xs+1, ys, xd, yd, ans+1);
                int a4=bestpath(mat, n, m, xs, ys+1, xd, yd, ans+1);
                int a1=bestpath(mat, n, m, xs-1, ys, xd, yd, ans+1);
                int a2=bestpath(mat, n, m, xs, ys-1, xd, yd, ans+1);
                mat[xs][ys]=1;
                ans=Integer.max(Integer.max(a3, Integer.max(a1, a2)), a4);
                return ans;
            }
        }
    }
    public static int longestPath(int[][] mat,int n,int m,int xs,int ys,int xd,int yd) {
        // code here
        int ans=0;
        ans = bestpath(mat, n, m, xs, ys, xd, yd, ans);
        return ans;
    }
}
