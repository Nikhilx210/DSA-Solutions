import java.util.*;

public class top_view {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static class depth{
        int data;
        Node node;
        depth(Node a ,int d){
            this.node=a;
            this.data=d;
        }
    }
    static void nodetraverser(depth a , int currposi , HashMap<Integer,depth> posistorer){
        if (a.node == null) {
            return;
        }
        if (!posistorer.containsKey((currposi))) {
            posistorer.put(currposi, a);
        }
        else{
            int h1 =(posistorer.get(currposi).data);
            int h2 = a.data;
            if(h2<=h1){
                posistorer.put(currposi, a);
            }
        }
        depth l1 = new depth(a.node.left,a.data+1);
        depth l2 = new depth(a.node.right,a.data+1);
        nodetraverser(l1, currposi - 1, posistorer);
        nodetraverser(l2, currposi + 1, posistorer);
        return;
    }
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, depth> posistorer = new HashMap<>();
        depth sample = new depth(root,0);
        nodetraverser(sample, 0, posistorer);
        int[] sub = new int [posistorer.keySet().size()];
        int num=0;
        for(int i:posistorer.keySet()){
            sub[num]=i;
            num++;
        }
        Arrays.sort(sub);
        for (int i : sub) {
            ans.add(posistorer.get(i).node.data);
        }
        return ans;
    }
}
