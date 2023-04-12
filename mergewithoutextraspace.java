import java.util.Arrays;

public class mergewithoutextraspace {
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i=n-1;
        int j =0;
        while(i>=0 && j<n){
            if(arr1[i]>arr2[j]){
                long swap =arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=swap;
                i--;
                j++;
            }
            else{
                j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
