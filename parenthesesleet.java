import java.util.Stack;

public class parenthesesleet {
    public boolean isValid(String s) {
        int z=s.length();
        boolean ans=true;
        Stack st =new Stack<Character>();
        for (int i=0;i<z;i++){
                Character m = s.charAt(i); 
                if(st.isEmpty()){
                    if(s.charAt(i)=='{'  ||  s.charAt(i)=='('   ||  s.charAt(i)=='['){
                        st.push(s.charAt(i));
                    }
                    else{
                        return false;
                    }
                }
                else{
                    Character n = (Character)st.peek();
                    if(s.charAt(i)=='{'  ||  s.charAt(i)=='('   ||  s.charAt(i)=='['){
                        st.push(s.charAt(i));
                    }
                    else if (m=='}' && n=='{'){
                        st.pop();
                    }
                    else if (m==')' && n=='('){
                        st.pop();
                    }
                    else if (m==']' && n=='['){
                        st.pop();
                    }
                    else{
                        return false;
                    }
            }
        }
        if(st.empty()){
            return ans;
        }
        else{
            return false;
        }
        
    }
    
}
