import java.util.Arrays;

public class kthsmallest {
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
    
    public static int kthSmallest(int[] nums, int k) 
    {   
        //Your code here
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
        if(ans==k-1){
            return nums[ans];
        }
        else if(ans<k-1){
            finans = kthSmallest(Arrays.copyOfRange(nums,ans+1,z),k-ans-1);
        }
        else if(ans>k-1){
            finans = kthSmallest(Arrays.copyOfRange(nums,0,ans),k);
        }
        return finans;
        
    } 
    public static void main(String[] args) {
        kthsmallest a = new kthsmallest();
        int arr[]={5,7,4,3,20,15};
        int arr210[]={0,0,0};
        System.out.println(a.kthSmallest(arr,2));
    }
    
}
