import java.util.*;

public class max_length_greedy {
    class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       // your code here
       Arrays.sort(arr, new Comparator<Pair>(){
        @Override
        public int compare(Pair o1,Pair o2){
            return o1.y-o2.y;
            // return ((o2.value/o2.weight)-(o1.value/o1.weight));
        }
        });
        int ans=1;
        int b=arr[0].y;
        for(int i=1;i<n;i++){
            if(b<arr[i].x){
                b=arr[i].y;
                ans++;
            }
        }
        return ans;
    }
}
