import java.util.Arrays;
import java.util.Collections;

public class permutationsinarr {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(a[i]+b[n-i-1]>=k){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
