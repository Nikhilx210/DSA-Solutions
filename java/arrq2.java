public class arrq2{

        public int maxProduct(int[] nums) {
             int z=nums.length;
            int mul=nums[0];
            int ans=mul;
            for(int i=1;i<z;i++){
                if(nums[i]>ans){
                    ans=nums[i];
                }
                if(nums[i]==0 || mul==0){
                    mul=1;
                }
                if(nums[i]!=0){
                    mul*=nums[i];
                    if(mul>ans){
                        ans=mul;
                    }
                }
            }
            mul=1;
            for(int i=z-1;i>=0;i--){
                if(nums[i]==0|| mul==0){
                    mul=1;
                }
                if(nums[i]!=0 ){
                    mul*=nums[i];
                    if(mul>ans){
                        ans=mul;
                    }
                }
            }
            return ans;
        }
}