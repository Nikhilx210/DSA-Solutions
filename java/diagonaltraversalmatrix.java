public class diagonaltraversalmatrix {
    static void diagonaltravmatrix(int a [][] ,int x , int y ){
        int i=0;
        for(i=0;i<x;i++){
            int alpha = i;
            int j=0;
            while(j<y && alpha >=0 ){
                System.out.print(a[alpha][j]+" ");
                j++;
                alpha--;
            }
            System.out.println();
        }
        if(i==x){
            for(int j=1;j<y;j++){
                int alpha = i-1;
                int beta =j;
                while(beta<y && alpha >=0 ){
                    System.out.print(a[alpha][beta] +" ");
                    beta++;
                    alpha--;  
                }
                System.out.println();
            }
        }
        
    }
    public static void main(String[] args)
    {
        int M[][] = {
                    {1  ,   2,     3   ,  4},
                    {5   ,  6 ,    7    , 8},
                    {9    ,10  ,  11,   12},
                    {13    ,14  ,  15,    16},
                    {17    ,18   , 19 ,   20}};
        diagonaltravmatrix(M,5,4);
    }
}
