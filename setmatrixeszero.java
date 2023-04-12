public class setmatrixeszero {
    public  static void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int colmnres=1;
        for(int i=0;i<r;i++){
            if(matrix[i][0]==0){
                colmnres=0;
                break;
            }
        }
        for(int i=0;i<c;i++){
            if(matrix[0][i]==0){
                matrix[0][0]=0;
                break;
            }
        }
        for(int i=1;i<r;i++){
            for (int j=1;j<c;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }        
        for(int i=1;i<r;i++){
            if(matrix[i][0]==0){
                for (int j=1;j<c;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=1;i<c;i++){
            if(matrix[0][i]==0){
                for (int j=1;j<r;j++){
                    matrix[j][i]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int i=0;i<c;i++){
                matrix[0][i]=0;
            }
        }
        if(colmnres==0){
            for(int i=0;i<r;i++){
                matrix[i][0]=0;
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
        setZeroes(M);
    }
}
