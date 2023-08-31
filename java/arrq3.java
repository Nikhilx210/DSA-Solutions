import java.util.Arrays;

public class arrq3 {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=-1;
        while(low<=high){
            if(nums[low]>nums[high]){
                mid=(low+high)/2;
                if(nums[mid]>=nums[low]){
                    low=mid+1;
                }else{
                    high=mid;
                }
            }else{
                return nums[low];
            }
        }
        return -1;

    }
}
