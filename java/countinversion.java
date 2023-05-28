import java.util.Arrays;

public class countinversion {
    static long count=0;
    public static void merge(long arr[] , int l ,int m , int r){
        int n1 = m-l+1;
        int n2 = r-m;
        long[] arr1 =new long[n1];
        long[] arr2 =new long[n2];
        for(int i =0;i<n1;i++){
            arr1[i]=arr[l+i];
        }
        for(int i =0;i<n2;i++){
            arr2[i]=arr[m+i+1];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j< n2){
            if(arr1[i]<arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                count+=n1-i;
                arr[k] = arr2[j];
                j++;
            }
            k++;
        } 
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
            
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
    
    public static void divide(long arr[] , int l , int r){
        if(l<r){
            int mid = (l+r-1)/2;
            divide(arr, l, mid);
            divide(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        int n=arr.length;
        divide(arr, 0, n-1);
        return count;
    }
    
}
// private static int mergeAndCount(int[] arr, int l,
//                                      int m, int r)
//     {

//         // Left subarray
//         int[] left = Arrays.copyOfRange(arr, l, m + 1);

//         // Right subarray
//         int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

//         int i = 0, j = 0, k = l, swaps = 0;

//         while (i < left.length && j < right.length) {
//             if (left[i] <= right[j])
//                 arr[k++] = left[i++];
//             else {
//                 arr[k++] = right[j++];
//                 swaps += (m + 1) - (l + i);
//             }
//         }
//         while (i < left.length)
//             arr[k++] = left[i++];
//         while (j < right.length)
//             arr[k++] = right[j++];
//         return swaps;
//     }

//     // Merge sort function
//     private static int mergeSortAndCount(int[] arr, int l,
//                                          int r)
//     {

//         // Keeps track of the inversion count at a
//         // particular node of the recursion tree
//         int count = 0;

//         if (l < r) {
//             int m = (l + r) / 2;

//             // Total inversion count = left subarray count
//             // + right subarray count + merge count

//             // Left subarray count
//             count += mergeSortAndCount(arr, l, m);

//             // Right subarray count
//             count += mergeSortAndCount(arr, m + 1, r);

//             // Merge count
//             count += mergeAndCount(arr, l, m, r);
//         }

//         return count;
//     }
