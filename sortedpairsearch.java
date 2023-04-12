public class sortedpairsearch {
    public int[] findPairSum(int[] arr, int target) {
        int z=arr.length;
        int[] ans = new int[2];
        int minind =0;
        int maxind =z-1;
        while(minind!=maxind){
            int s=arr[minind]+arr[maxind];
            if(s<target){
                minind++;
            }
            else if(s>target){
                maxind--;
            }
            else{
                ans[0] =minind;
                ans[1] =maxind;
                return ans ;
            }
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
}
