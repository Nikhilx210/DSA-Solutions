import java.util.Arrays;

public class kthlargest {
    public int findKthLargest(int[] nums, int k) {
        int z = nums.length;
        if(z==1) {
            return nums[0];
        }
        int i=-1;
        int pvt=z-1;
        int ans =0;
        int finans=0;
        for (int j=0;j<z;j++){
            if(nums[j]<nums[pvt]){
                i+=1;
                int c = nums[i];
                nums[i]=nums[j];
                nums[j]=c;  
            }
            else if(j==z-1){
                i+=1;
                int c = nums[i];
                nums[i]=nums[z-1];
                nums[z-1]=c;
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
            int pq=arr1.length;
            finans=findKthLargest(arr1,k-(z-pq));
        }
        return finans;
    }
    public static void main(String[] args) {
        kthlargest a = new kthlargest();
        int arr[]={3,2,3,1,2,4,5,5,6};
        int arr210[]={1,2,3,4,5,6};
        System.out.println(a.findKthLargest(arr,4));
        
    }
}
