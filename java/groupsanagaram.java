import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

public class groupsanagaram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String,List > h=new Hashtable<>();
        int n =strs.length;
        for (int i=0;i<n;i++){
            int arr [] = new int [26];
            int k = strs[i].length();
            for(int j=0;j<k;j++){
                int p = strs[i].charAt(j) - 'a';
                System.out.println(Arrays.toString(arr));
                arr[p]+=1;
            }
            String key =Arrays.toString(arr);
            if(h.containsKey(key)){
                h.get(key).add(strs[i]);
            }
            else{
                List<String> list=new ArrayList<String>();
                list.add(strs[i]);
                h.put(key, list);
            }
        }
        List<List<String>> listOfLists = new ArrayList<>(); 
        for(String a:h.keySet()){
            listOfLists.add(h.get(a));
        }
        return listOfLists;
        
        
    }
}
