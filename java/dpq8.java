public class dpq8 {
    public int rob(int[] nums) {
        int len=nums.length;
        int []arr = new int[len-1];
        if(len==1){
            return nums[0];
        }
        if(len==2){
            return Integer.max(nums[0],nums[1]);
        }
        if(len==3){
            return Integer.max(nums[0],Integer.max(nums[1], nums[2]));
        }
        arr[0]=nums[0];
        arr[1]=nums[1];
        int a=nums[0];
        int b=0;
        for( int i=2;i<len-1;i++){
            if(i>2){
                a=arr[i-2];
                b=arr[i-3];
            }
            arr[i]=Integer.max(a,b)+nums[i];
        }
        int ans=Integer.max(arr[len-3], arr[len-2]);
        int []arr2 = new int[len-1];
        arr2[0]=nums[1];
        arr2[1]=nums[2];
        int c=nums[1];
        int d=0;
        for( int i=2;i<len-1;i++){
            if(i>2){
                c=arr2[i-2];
                d=arr2[i-3];
            }
            arr2[i]=Integer.max(c,d)+nums[i+1];
        }
        int ans2=Integer.max(arr2[len-3], arr2[len-2]);
        return Integer.max(ans,ans2); 
    }
}
