public class anagramleet {
    public boolean isAnagram(String s, String t) {
        int z =s.length();
        int y =t.length();
        if(y!=z){
            return false;
        }
        boolean ans =true;
        int arr[] = new int[26];
        int arr1[] = new int[26];
        for (int i=0;i<z;i++){
            int p=s.charAt(i)-97;
            arr[p]+=1;
            int q=t.charAt(i)-97;
            arr1[q]+=1;
        } 
        for(int i=0;i<26;i++){
            if(arr[i]!=arr1[i]){
                return false;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="abc";
        String t="cba";
        
        anagramleet a = new anagramleet();
        System.out.println(a.isAnagram(s,t));
    }
}
