public class minimumopertopalindrome {
    public static int operatortopalindrome(int[] arr){
        int z= arr.length;
        int low =0;
        int high =z-1;
        int ans =0;
        while(low<=high){
            if(arr[low]==arr[high]){
                low++;
                high--;
            }
            else if (arr[low]<arr[high]){
                arr[low+1] = arr[low]+ arr[low+1];
                low++;
                ans+=1;
            }
            else {
                arr[high-1] = arr[high]+ arr[high-1];
                ans+=1;
                high--;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[]={15, 4, 15};
        int arr210[]={0,0,0};
        System.out.println(operatortopalindrome(arr));
        //System.out.println(a.printLargest(arr));
    }
    
}
