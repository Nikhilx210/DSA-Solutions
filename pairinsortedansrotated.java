public class pairinsortedansrotated {
    public boolean findPairSum(int[] arr, int target) {
        int z=arr.length;
        int max=Integer.MIN_VALUE;
        int maxind=-1;
        int minind=-1;
        int min=Integer.MAX_VALUE;
        boolean ans =false;
        for (int i =0; i<z;i++){
            if(max<arr[i]){
                maxind=i;
            }
            max=Integer.max(max,arr[i]);
            if(min>arr[i]){
                minind=i;
            }
            min=Integer.min(min,arr[i]);
        }
        while(minind!=maxind){
            if(minind==z){
                minind=0;
            }
            else if(maxind==-1){
                maxind=z-1;
            }
            if(minind==maxind){
                return ans;
            }
            int s=arr[minind]+arr[maxind];
            if(s<target){
                minind++;
            }
            else if(s>target){
                maxind--;
            }
            else{
                ans = true ;
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        pairinsortedansrotated a = new pairinsortedansrotated();
        int arr[]={8,10,11,1};
        int arr210[]={3,1,2};
        System.out.println(a.findPairSum(arr,2));
    }
}
