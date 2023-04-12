import java.util.Arrays;

public class tripletsumlessthanx {
    long countTriplets(long arr[], int n,int sum)
    {   
        Arrays.sort(arr);
        int a= 0;
        int b= 1;
        int c= n-1;
        long count =0;
        int last =n-1;
        while(a<b){
            b=a+1;
            while(b<c){
                if(arr[a]+arr[b]+arr[c] <sum){
                    count+=c-b;
                    b+=1;
                }
                else{
                    c-=1; 
                }
            }
            a+=1;
        }
        return count;
    }
}
