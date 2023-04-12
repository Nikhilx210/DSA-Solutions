import java.util.Arrays;

public class maxsubproduct {
    public int maxProduct(int[] nums) {
        int z=nums.length;
        if(z==1){
            return nums[0];
        }
        int[] ans =new int[z];
        int max =Integer.MIN_VALUE;
        for(int i=0;i<z;i++){
            if(i==0){
                ans[i]=nums[i];
                max=Integer.max(max,ans[i]);
            }
            else{
                ans[i]=ans[i-1]*nums[i];
                max=Integer.max(max,ans[i]);
                max=Integer.max(max,nums[i]);
            }
            int[] ans1 =new int[z-i];
            
            if(ans[i]<0){
                for(int j=i;j<z;j++){
                    if(j==i){
                        if(i==0){
                            ans1[0]=nums[i];
                        }else{
                            ans1[0]=ans[i-1]*nums[i];
                            max=Integer.max(max,ans1[j-i]);
                        }
 
                    }
                    else{
                        ans1[j-i]=ans1[j-i-1]*nums[j];
                        max=Integer.max(max,ans1[j-i]);
                    }
                }
                ans[i]=1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        maxsubproduct a = new maxsubproduct();
        int arr[]={2,-5,-2,-4,3};
        int arr210[]={1,2,3,4};
        System.out.println(a.maxProduct(arr)
        );

    }
}
