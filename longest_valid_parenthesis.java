public class longest_valid_parenthesis {
    static int maxLength(String S){
        // code here
        // code here
        int sum=0;
        int len=0;
        int ans=0;
        int size=S.length();
        for(int i=0;i<size;i++){
            if(S.charAt(i)=='('){
                sum++;
                len++;
            }
            else {
                sum--;
                len++;
            }
            if(sum==0){
                ans= Integer.max(ans,len);
            }
            if(sum<0){
                len=0;
                sum=0;
            }
        }
        len=0;
        sum=0;
        for(int i=size-1;i>=0;i--){
            if(S.charAt(i)==')'){
                sum++;
                len++;
            }
            else {
                sum--;
                len++;
            }
            if(sum==0){
                ans= Integer.max(ans,len);
            }
            if(sum<0){
                len=0;
                sum=0;
            }
        }
        return ans;
    }
}
