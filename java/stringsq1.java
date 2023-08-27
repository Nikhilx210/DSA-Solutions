import java.util.Hashtable;

public class stringsq1 {
    public int lengthOfLongestSubstring(String s) {
        Hashtable<Character, Integer> h = new Hashtable<>();
        int z = s.length();
        int ans = 0;
        int finans = 0;
        int pivot = -1;
        for (int i = 0; i < z; i++) {
            if (h.containsKey(s.charAt(i))) {
                pivot = Integer.max(pivot, h.get(s.charAt(i)));
                ans = i - pivot;
                h.replace(s.charAt(i), i);
            } else {
                h.put(s.charAt(i), i);
                ans = i - pivot;
            }
            finans = Integer.max(finans, ans);
        }
        return finans;
    }
}
