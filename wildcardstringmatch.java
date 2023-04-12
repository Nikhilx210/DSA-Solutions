public class wildcardstringmatch {
    static boolean match(String wild, String pattern)
    {
        // code here
        int zw=wild.length();
        int zp=pattern.length();
        int point =0;
        for(int i=0;i<zw;i++){
            if(wild.charAt(i)!='*' && wild.charAt(i)!='?'){
                if(wild.charAt(i)==pattern.charAt(point)){
                    point++;
                }
                else {
                    return false;
                }
            }
            else if(wild.charAt(i)=='?'){
                if(i!=zw-1){
                    point++;
                }
                else{
                    if(point==zp-2){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                
            }
            else if(wild.charAt(i)=='*'){
                if(i!=zw-1){
                    Character alpha = wild.charAt(i+1);
                    
                    int flag = 0;
                    for(int j=i;j<zp;j++){
                        if(pattern.charAt(j)==alpha){
                            flag=1;
                            point+=j-i;
                            break;
                        }
                        else{
                            continue;
                        }
                    }
                    if(flag==0){
                        return false;
                    }
                }
                else{
                    continue;
                }
            }   
        }
        return true;

    }
    public static void main(String[] args) {
        wildcardstringmatch a = new wildcardstringmatch();
        String s = "ge*ks";
        String p = "geeks";
        Boolean answer = match(s, p);
        System.out.println(answer);
    }
}
