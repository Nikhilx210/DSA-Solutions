public class rptandmiss {
    public int[] repeatedNumber(final int[] A) {
        int z=A.length;
        int[] arr = new int[z];
        int a=0;
        int b=0;
        for (int i=0;i<z;i++){
            arr[A[i]-1]+=1;
        }
        for (int i=0;i<z;i++){
            if(arr[i]==0){
                a=i+1;
            }
            if(arr[i]==2){
                b=i+1;
            }
        }
        int[] ans= {b,a};
        return ans;
    }
}
