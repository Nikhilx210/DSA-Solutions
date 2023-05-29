public class countingsort {
    public static String countSort(String arr)
    {
        // code here
        int len = arr.length();
        int [] count = new int[26];
        String ans="";
        for(int i=0;i<len;i++){
            count[arr.charAt(i)-'a'] +=1;
        }
        for(int i=0;i<26;i++){
            int alpha =count[i];
            char beta=(char)(i+'a');
            if(alpha!=0){
            ans+=(beta+"").repeat(alpha);   
            }
        }
        return ans;
    }
    
}
