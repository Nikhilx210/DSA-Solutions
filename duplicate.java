import java.util.*;
public class duplicate {
    public boolean containsDuplicate(int[] nums) {
        int z=nums.length;
        Set<Integer> setnum = new HashSet<Integer>();
        for(int i=0;i<z;i++){
            setnum.add(nums[i]);
        }
        int y=setnum.size();
        if(z==y){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        duplicate a = new duplicate();
        int arr[]={-4,-2,-3,-1};
        System.out.println(a.containsDuplicate(arr));
    }
}

