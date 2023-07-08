import java.util.Arrays;

public class pairdiff {
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        int alpha =0;
        for(int i=0;i<size;i++){
            alpha = n + arr[i];
            int a = arr.length;
            int l=i+1;
            int r=a-1;
            int binans=-1;
            while(l<=r){
                int mid = (l+r)/2;
                if(alpha>arr[mid]){
                    l=mid+1;
                }
                else if(alpha==arr[mid]){
                    binans=mid;
                    break;
                }
                else{
                    r=mid-1;
                }
            }
            if(binans!=-1){
                return true;
            }
        }
        return false;
    }
}
