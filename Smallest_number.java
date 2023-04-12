public class Smallest_number {
    static String smallestNumber(int S, int D){
        String ans="";
        if(9*D<S){
            return "-1";
        }
        while(D>0 && S>0){
            if(D!=1){
                if(S>1){
                    int a=9;
                    while(a>S){
                        a--;
                    }
                    if(a==S){
                        a= a-1;
                    }
                    S=S-a;
                    ans = a + ans;
                }
                else{
                    ans="0"+ans;
                }
            }
            else{
                ans= S + ans;
                S=0;
            }
            D--;
        }
        return ans;
    }
}
