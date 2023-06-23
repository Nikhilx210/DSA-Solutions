public class kthlarge {
    public int findKthLargest(int[] nums, int k) {
        public void swap(int a , int b){
            int c= a;
            a=b;
            b=c;
        }
        public int findKthLargest(int[] nums, int k) {
            int z = nums.length;
            int i=-1;
            int pvt=z-1;
            int ans =0;
            int finans=0;
            for (int j=0;j<z;j++){
                if(nums[j]<nums[pvt]){
                    i+=1;
                    swap(nums[i],nums[j]);
                }
                else if(j==z-1){
                    i+=1;
                    swap(nums[i],nums[z-1]);
                    ans=i;
                }
            }
            if(ans==z-k){
                return nums[ans];
            }
            else if(ans<z-k){
                int [] arr2=Arrays.copyOfRange(nums,ans+1,z);
                finans =findKthLargest(arr2, k);
            }
            else if(ans>z-k){
                int [] arr1=Arrays.copyOfRange(nums,0,ans);
                finans=findKthLargest(arr1,k-(z-ans)-1);
            }
            return finans;
        
    }
    
}
