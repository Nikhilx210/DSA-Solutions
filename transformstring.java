public class transformstring {
    static int transformst (String A, String B)
    {
        // code here
        int za =A.length();
        int zb =B.length();
        A = A.toLowerCase();
        B = B.toLowerCase();
        System.out.println(A);
        StringBuffer a = new StringBuffer(A);
        StringBuffer b = new StringBuffer(B);
        if(za!=zb){
            return -1;
        }
        int Arra[] =new int[26];
        int Arrb[] =new int[26];
        for(int i=zb-1;i>=0;i--){
            int alpha = a.charAt(i)-'a';
            int beta  =b.charAt(i)-'a';
            Arra[alpha]+=1;
            Arrb[beta]+=1;
        }
        for(int i=0;i<26;i++){
            if(Arra[i]==Arrb[i]){
                continue;
            }
            else{
                return-1;
            }
        }
        int anscount=0;
        for(int i=zb-1;i>=0;i--){
            if(b.charAt(i)==a.charAt(i)){
                continue;
            }
            else{
                int j =i;
                int flag=0;
                while(j>=0){
                    anscount++;
                    char swap = a.charAt(j);
                    a.deleteCharAt(j);
                    a.insert(0, swap);
                    System.out.println(a);
                    if(b.charAt(i)==a.charAt(j)){
                        flag=1;
                        break;
                    }  
                }
                if(flag==0){
                    return -1;
                }
            }
        }
        return  anscount;
    }
    public static void main(String[] args) {
        transformstring a = new transformstring();
        String s = "Geeksforgeeks";
        String p = "forgeeksgeeks";
        int answer = transformst(s, p);
        System.out.println(answer);
    }
    
}
