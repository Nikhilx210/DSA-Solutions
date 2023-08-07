import java.util.*;

public class mergeoverlap {
    public int[][] overlappedInterval(int[][] arr)
    {   int z = arr.length;
        // Code here // Code 
        Arrays.sort(arr,new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
            
        });
        int lenofansarr=0;
        for(int i=1;i<z;i++){
            int a1=arr[i-1][0];
            int b1=arr[i][0];
            int a2=arr[i-1][1];
            int b2=arr[i][1];
            if(a2>=b1 && a2<=b2){
                arr[i][0]=a1;
                arr[i][1]=b2;
                arr[i-1][0]=-1;
                arr[i-1][1]=-1;
                lenofansarr++;
            }
            else if(a2>=b1 && a2>=b2 ){
                arr[i][0]=a1;
                arr[i][1]=a2;
                arr[i-1][0]=-1;
                arr[i-1][1]=-1;
                lenofansarr++;
            }
        }
        int pq= z-lenofansarr;
        int[][] ans = new int[pq][2];
        int j=0;
        for(int i=0;i<z;i++){
            if(arr[i][0]==-1 && arr[i][1]==-1){
                continue;
            }
            else { 
                ans[j][0]=arr[i][0];
                ans[j][1]=arr[i][1];
                j++;
            }  
        }
        return ans;
    }
    public static void main(String[] args) {
        mergeoverlap a = new mergeoverlap();
        int arr[][]=    {{1,3},{2,4},{6,8},{9,10}};
        int arr210[]={0,0,0};
        System.out.println(Arrays.toString(a.overlappedInterval(arr)));
        //System.out.println(a.printLargest(arr));
    }
    
}
