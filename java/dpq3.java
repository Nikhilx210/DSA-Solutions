import java.util.*;

public class dpq3 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int [] dp = new int[len];
        Arrays.fill(dp,1);
        dp[0]=1;
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Integer.max(dp[i],dp[j]+1);
                }
            }
        }
        int ans = 1;
        for(int i=0;i<len;i++){
            ans= Integer.max(ans, dp[i]);
        }
        return ans;
    }
}
