
class maxsub  {
    public int maxSubArray(int[] nums) {
        int z=nums.length;
        int ans=0;
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<z;i++){
            if(ans<0){
                ans=0;
            }
            ans+=nums[i];
            if(ans>sum){
                sum=ans;
            }
        }
        if(sum==0){
            sum=Integer.MIN_VALUE;
            for(int i=0;i<z;i++){
                sum=Integer.max(nums[i],sum);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        maxsub a = new maxsub();
        int arr[]={-4,-2,-3,-1};
        System.out.println(a.maxSubArray(arr));
    }
}
