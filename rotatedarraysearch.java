import javax.naming.directory.SearchControls;

public class rotatedarraysearch {
    public int search(int[] nums, int target) {
        int z=nums.length;
        int low1 = 0;
        int high1 = z-1; 
        int p = -1;
        if(z==1){
            if(nums[0]==target){
                p=0;
            }
        }
        else if(z==0){
            p=-1;
        }
        else{
            while(low1<=high1){
                if(nums[low1]==target){
                    p=low1;
                    break;
                }
                else if(nums[high1]==target){
                    p=high1;
                    break;
                }
                else{
                    low1+=1;
                    high1-=1;
                }
            }
        }    
        return p;
    }
    
    public static void main(String[] args) {
        rotatedarraysearch a = new rotatedarraysearch();
        int arr[]={6,7,1,2,3};
        System.out.println(a.search(arr,3));
    }
}
