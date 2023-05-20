import java.util.*;

public class combinationsum {
    public static void path (ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> A, int B,ArrayList<Integer>Dir){
        ArrayList<Integer> dir =new ArrayList<>();
        dir.addAll(Dir);
        if(B==0){

            ans.add(dir);
            return;
        }
        else if(B<0){
            return;
        }
        else{
            int len =A.size();
            for(int i=0;i<len;i++){
                int am =A.get(i);
                Dir.add(Dir.size(),am);
                ArrayList<Integer> d =new ArrayList<>();
                for(int j=i;j<A.size();j++){
                    d.add(j-i, A.get(j));;
                }
                path(ans, d, B-am, Dir);
                Dir.remove(Dir.size()-1);
            }
        }
    }
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> dir =new ArrayList<>();
        Set<Integer> se= new HashSet<Integer>();
        se.addAll(A);
        A.clear();
        A.addAll(se);
        Collections.sort(A);  
        path(ans, A, B, dir);
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(8);
        a.add(1);
        a.add(8);
        a.add(6);
        a.add(6);
        ArrayList<ArrayList<Integer>> A = combinationSum(a, 12);
        System.out.println(A);
    }
}
