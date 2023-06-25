import java.util.ArrayList;
import java.util.List;

public class maxstock {
    public int maxProfit(int[] prices) {
        int z=prices.length;
        if(z==0 ||z==1){
            return 0;
        }
        if(z==2){
            if(prices[1]-prices[0]>0){
                return prices[1]-prices[0];
            }
            else{
                return 0;
            }
        }
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MAX_VALUE;
        int ans=Integer.MIN_VALUE;
        for(int i = z-1;i>0;i--){
            if(m1<prices[i]){
                m2=prices[i-1];   
            }
            else{
                m2 =Integer.min(m2,prices[i-1]);
            }
            m1 = Integer.max(m1,prices[i]);
            ans=Integer.max(ans,m1-m2);
        }
        if(ans<=0){
            return 0;
        }
        else{
            return ans;
        }
    }
    public static void main(String[] args) {
        maxstock a = new maxstock();
        int arr[]={7,6,5,3};
        System.out.println(a.maxProfit(arr));
        
    }
}
