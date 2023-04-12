public class palindromeleetcode {
    public boolean isPalindrome(String s) {
        int z =s.length();
        boolean ans =true;
        String p ="";
        s =s.toLowerCase();
        for (int i =0;i<z;i++){
            if((s.charAt(i)>=97 &&  s.charAt(i)<=122) || (s.charAt(i)>=48 &&  s.charAt(i)<=57)){
                p+=s.charAt(i);
            }
        }
        int m=p.length();
        if(m==0 || m==1){
            return true;
        }
        int low =0;
        int high =m-1;
        while(low<=high){
            if(p.charAt(high)==p.charAt(low)){
                low++;
                high--;
            }
            else{
                ans =false;
                return ans;
            }
        }
        return ans;
    }
    
}
