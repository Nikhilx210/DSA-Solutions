import java.util.Arrays;

public class rotten_oranges {
    public int orangesRotting(int[][] grid)
    {
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 500;
                }
                if (grid[i][j] == 0) {
                    grid[i][j] = 1000;
                }
                if (grid[i][j] == 2) {
                    grid[i][j] = 0;
                }

            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 500) {
                    if (i - 1 >= 0) {
                        grid[i][j] = Integer.min(grid[i - 1][j] + 1, grid[i][j]);
                    }
                    if (i + 1 < grid.length) {
                        grid[i][j] = Integer.min(grid[i + 1][j] + 1, grid[i][j]);
                    }
                    if (j + 1 < grid[0].length) {
                        grid[i][j] = Integer.min(grid[i][j + 1] + 1, grid[i][j]);
                    }
                    if (j - 1 >= 0) {
                        grid[i][j] = Integer.min(grid[i][j - 1] + 1, grid[i][j]);
                    }
                }
            }
        }
        for (int i = grid.length-1; i >= 0; i--) {
            for (int j = grid[0].length-1; j >= 0; j--) {
                if (grid[i][j] == 1000) {
                    continue;
                }
                else{
                    if (i - 1 >= 0) {
                        grid[i][j] = Integer.min(grid[i - 1][j] + 1, grid[i][j]);
                    }
                    if (i + 1 < grid.length) {
                        grid[i][j] = Integer.min(grid[i + 1][j] + 1, grid[i][j]);
                    }
                    if (j + 1 < grid[0].length) {
                        grid[i][j] = Integer.min(grid[i][j + 1] + 1, grid[i][j]);
                    }
                    if (j - 1 >= 0) {
                        grid[i][j] = Integer.min(grid[i][j - 1] + 1, grid[i][j]);
                    }
                }

            }
        }

        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==500){
                    return -1;
                }
                else if (grid[i][j]!=1000){
                    ans=Integer.max(ans, grid[i][j]);
                }
            }
        }
        return ans;
        
    }
}
