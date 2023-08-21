public class dpq11 {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if(len==1){
            return true;
        }
        int max=0;
        for(int i=0;i<len-1;i++){
            if(nums[max]==0 && max<=i){
                return false;
            }
            else{
                max=Integer.max(max,nums[i]+i);
                if(max>=len-1){
                    return true;
                }
            }
        }
        return false;
    }
}
