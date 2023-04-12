import java.util.*;

public class longestsubstring {
    public int lengthOfLongestSubstring(String s) {
        Hashtable<Character,Integer> h=new Hashtable<>();
        int z = s.length();
        int ans=0;
        int finans=0;
        int pivot =-1;
        for (int i=0;i<z;i++){
            if(h.containsKey(s.charAt(i))){
                if(h.get(s.charAt(i))<pivot){
                    h.put(s.charAt(i),i);
                    ans+=1;
                }
                else{
                    pivot =h.get(s.charAt(i))+1;
                    ans=i-h.get(s.charAt(i));
                    h.put(s.charAt(i),i );
                }
            }
            else{
                h.put(s.charAt(i),i);
                ans+=1;
            }
            finans=Integer.max(ans,finans);
        }
        return finans;

    }
    
}
