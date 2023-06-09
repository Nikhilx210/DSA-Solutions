public class gridisland {
    
    public static void webmaker(char[][] grid ,int count,int x,int y){
        int row =grid.length;
        int col =grid[0].length;
        if(x>=row || y>=col || x<0 || y<0 ){
            return;
        }
        else if(grid[x][y]!='1'){
            return;
        }
        else{
            grid[x][y]=(char)(256 - count);
        }
        webmaker(grid, count, x+1, y);
        webmaker(grid, count, x, y+1);
        webmaker(grid, count, x-1, y);
        webmaker(grid, count, x, y-1);
        webmaker(grid, count, x+1, y+1);
        webmaker(grid, count, x+1, y-1);
        webmaker(grid, count, x-1, y+1);
        webmaker(grid, count, x-1, y-1);
    }
    public static int numIslands(char[][] grid) {
        // Code here
        int row =grid.length;
        int col =grid[0].length;
        int count = 2;
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    webmaker(grid, count, i, j);
                    count+=1;
                }
            }
        }
        return count-2;
    }
    public static void main(String[] args) {
        char M[][] = new char[][] { { '1', '1', '0', '1', '1' },
                                  { '0', '1', '1', '0', '0' },
                                  { '1', '0', '0', '0', '1' },
                                  { '0', '0', '0', '0', '0' },
                                  { '1', '0', '1', '0', '1' } };
        char M1[][] = new char[][] { { '0', '1' },
                                  { '1', '0' },
                                  { '1', '1'},
                                  { '1', '0' }
                                   };
        
        numIslands(M1);
    }
}
