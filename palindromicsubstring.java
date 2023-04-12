public class palindromicsubstring {
    public int countSubstrings(String s) {
        int z = s.length();
        int anslen = z;
        for (int i=0;i<z-1;i++){
            int len =0;
            if(s.charAt(i)== s.charAt(i+1)){
                int l  = i;
                int r  = i+1;
                while(l>=0 && r<=z-1){
                    if((s.charAt(l)== s.charAt(r))){
                        anslen+=1;
                        l--;
                        r++;
                    }
                    else{
                        break;
                    }
                }
                
            }
        }
        for (int i=1;i<z-1;i++){
            int len =0;
            if(s.charAt(i-1)== s.charAt(i+1)){
                len=1;
                int l  = i-1;
                int r  = i+1;
                while(l>=0 && r<=z-1){
                    if((s.charAt(l)== s.charAt(r))){
                        anslen+=1;
                        l--;
                        r++;
                    }
                    else{
                        break;
                    }
                }

            }
        }
        return anslen;
        
    }
    
}
