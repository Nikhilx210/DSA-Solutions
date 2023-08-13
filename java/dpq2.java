import java.util.Arrays;

public class dpq2 {
    public int coinChange(int[] coins, int amount) {
        int[]dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<coins.length;j++){
                if(i-coins[j]>=0){
                    dp[i]=Integer.min(dp[i],1+dp[i-coins[j]]);
                }
            }
        }
        if(dp[dp.length-1]>amount){
            return -1;
        }
        return dp[dp.length-1];
    }
}
