import java.util.*;

public class dpq5 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 0; j < wordDict.size(); j++) {
                if ((i - wordDict.get(j).length()) >= 0
                        && s.substring(i - wordDict.get(j).length(), i).equals(wordDict.get(j)) && dp[i] == 0) {
                    dp[i] = dp[i - wordDict.get(j).length()];
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        if (dp[dp.length - 1] == 1) {
            return true;
        }
        return false;
    }
}
