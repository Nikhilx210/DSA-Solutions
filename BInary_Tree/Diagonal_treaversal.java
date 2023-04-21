import java.util.*;

public class Diagonal_treaversal {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    static void nodetraverser(Node a , int currposi , HashMap<Integer,ArrayList<Integer>> posistorer){
        if (a == null) {
            return;
        }
        if(posistorer.containsKey(currposi)){
            posistorer.get(currposi).add(a.data);
        }
        else{
            ArrayList<Integer> z = new ArrayList<>();
            z.add( a.data);
            posistorer.put(currposi, z);
        }

        nodetraverser(a.left, currposi + 1, posistorer);
        nodetraverser(a.right, currposi , posistorer);
        return;
    }
    public ArrayList<Integer> diagonal(Node root)
    {
        // add your code
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> posistorer = new HashMap<>();
        nodetraverser(root, 0, posistorer);
        int[] sub = new int [posistorer.keySet().size()];
        int num=0;
        for(int i:posistorer.keySet()){
            sub[num]=i;
            num++;
        }
        Arrays.sort(sub);
        for (int i : sub) {
            ans.addAll(posistorer.get(i));
        }
        return ans;
    }
}
