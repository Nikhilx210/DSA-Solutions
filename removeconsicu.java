public class removeconsicu {
    public String removeConsecutiveCharacter(String s){
        int z=s.length();
        String p="";
        for(int i =0; i<z;i++){
            if(i==z-1){
                p+=s.charAt(i);
            }
            else{
                if(s.charAt(i)==s.charAt(i+1)){
                    continue;
                }
                else{
                    p+=s.charAt(i);
                }
            }
        }
        return p;

    }
}
