public class longestcommonprefix {
    public String longestCommonPrefix(String[] strs){
        String ans ="";
        int lencompare =Integer.MAX_VALUE;
        int ind = -1;
        int z = strs.length;
        for (int i=0;i<z;i++){
            if(lencompare>strs[i].length()){
                ind=i;
            }
            lencompare = Integer.min(lencompare, strs[i].length());
        }
        String compare =strs[ind];
        for (int j =0;j<lencompare;j++){
            int p=0;
            for (int i=0;i<z;i++){
                if(strs[i].charAt(j)==compare.charAt(j)){
                    continue;
                }
                else{
                    p=1;
                }
            }
            if(p==0){
                ans+=compare.charAt(j);
            }
            else{
                return ans;
            }

        }    
        return ans;

    }
    
}
