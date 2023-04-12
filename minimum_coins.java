import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class minimum_coins {
    static List<Integer> minPartition(int N)
    {
        // code here
        List<Integer> ans = new ArrayList<>();
        int coin[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 } ;
        for(int i=coin.length-1;i>=0;i--){
            while(N>=coin[i]){
                ans.add(coin[i]);
                N-=coin[i];
            }
        }
        return ans;
    }
}
