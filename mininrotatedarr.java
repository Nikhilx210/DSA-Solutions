import java.util.Arrays;

public class mininrotatedarr {
    public int findMin(int[] nums) {
        int z = nums.length;
        int min =0;
        if (z==1){
            return nums[0];
        }
        int m=z/2;
        if(nums[m]>nums[0] && nums[m]>nums[z-1]){
            if(nums[0]<nums[z-1]){
                min=findMin(Arrays.copyOfRange(nums, 0,m+1));
            }
            else{
                min=findMin(Arrays.copyOfRange(nums, m,z));
            }
        }
        else if(nums[m]<nums[0] && nums[m]<nums[z-1]){
            if(nums[0]>nums[z-1]){
                min =findMin(Arrays.copyOfRange(nums, 0,m+1));
            }
            else{
                min =findMin(Arrays.copyOfRange(nums, m,z));
            }
        }
        else{
            return nums[0];
        }
        return min; 
        }
        public static void main(String[] args) {
            mininrotatedarr a = new mininrotatedarr();
            int arr[]={2,3,4,5,1};
            int arr210[]={3,1,2};
            System.out.println(a.findMin(arr));
    
        }    
        
    }



