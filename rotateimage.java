public class rotateimage {
    public void rotate(int[][] matrix) {
        int row =matrix.length;
        int col =matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int swap=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=swap;
            }
        }
        for(int i=0;i<col/2;i++){
            for(int j=0;j<row;j++){
                int swap=matrix[j][i];
                matrix[j][i]=matrix[j][col-1-i];
                matrix[j][col-1-i]=swap;
            }
        }
        
    }
}
