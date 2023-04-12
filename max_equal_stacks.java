public class max_equal_stacks {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        // code here
        int pnt1=N1-1;
        int pnt2=N2-1;
        int pnt3=N3-1;
        int sum1=S1[pnt1];
        int sum2=S2[pnt2];
        int sum3=S3[pnt3];
        pnt1--;
        pnt2--;
        pnt3--;
        int maxi = Integer.max(sum2, Integer.max(sum1, sum3));
        int ans=0;
        while(pnt1>=0 || pnt2>=0 || pnt3>=0){
            if(sum1<maxi && pnt1>=0 ){
                sum1+=S1[pnt1];
                pnt1--;
            }
            if(sum2<maxi && pnt2>=0){
                sum2+=S2[pnt2];
                pnt2--;
            }
            if(sum3<maxi && pnt3>=0){
                sum3+=S3[pnt3];
                pnt3--;
            }
            if(sum1==sum2 && sum2==sum3){
                ans=sum1;
            }
            maxi =Integer.max(sum2, Integer.max(sum1, sum3));
        }
        return ans;
    }
}
