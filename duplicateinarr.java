import java.util.ArrayList;

public class duplicateinarr {
    public static ArrayList<Integer> duplicates(int numRay[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] % numRay.length]
                = numRay[numRay[i] % numRay.length]
                  + numRay.length;
        }
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length * 2) {
                ans.add(i);
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }
        return ans;
        
    }
}
