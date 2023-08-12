public class dpq1 {
        public int climbStairs(int n) {
            int a=1;
            int b=1;
            int c=0;
            if(n==1){
                return 1;
            }
            else{
                for(int i=2;i<=n;i++){
                    c=a+b;
                    a=b;
                    b=c;
                }
                return b;
            } 
    }
}
