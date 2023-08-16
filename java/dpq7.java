public class dpq7 {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Integer.max(nums[0],nums[1]);
        }
        int a=nums[0];
        int b=0;
        for( int i=2;i<nums.length;i++){
            if(i>2){
                a=nums[i-2];
                b=nums[i-3];
            }
            nums[i]=Integer.max(a, b)+nums[i];
        }
        return Integer.max(nums[nums.length-1], nums[nums.length-2]);
    }
}
