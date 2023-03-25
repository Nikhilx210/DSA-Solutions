import java.util.ArrayList;
import java.util.Arrays;
import java.math.*;

public class distance_Of_nearest_one {
    // public int[][] nearest(int[][] grid)
    // {
    //     // Code here
    //     ArrayList<ArrayList<Integer>> zeros = new ArrayList<>();
    //     ArrayList<ArrayList<Integer>> ones = new ArrayList<>();
    //     int zeros_cnt =0;
    //     int ones_cnt =0;
    //     for(int i=0;i<grid.length;i++){
    //         for(int j=0;j<grid[0].length;j++){
    //             ArrayList<Integer> index = new ArrayList<>();
    //             if( grid[i][j]==1){
    //                 index.add(i);
    //                 index.add(j);
    //                 ones.add(ones_cnt,index);
    //             }
    //             else{
    //                 index.add(i);
    //                 index.add(j);
    //                 zeros.add(zeros_cnt,index);
    //             }
    //         }
    //     }
    //     int[][] ans= new int[grid.length][grid[0].length];
    //     for(int i=0;i<zeros.size();i++){
    //         int a = zeros.get(i).get(0);
    //         int b = zeros.get(i).get(1);
    //         int ansmin = Integer.MAX_VALUE;
    //         for(int j=0;j<ones.size();j++){
    //             int c = ones.get(j).get(0);
    //             int d = ones.get(j).get(1);
    //             ansmin = Integer.min(ansmin, (Math.abs(c-a) + Math.abs(d-b)));
    //         }
    //         ans[a][b]=ansmin;
    //     }
    //     return ans;
    // }
    public static int[][] nearest(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    grid[i][j] = 500;
                }
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 500) {
                    if (i - 1 >= 0) {
                        grid[i][j] = Integer.min(grid[i - 1][j] + 1, grid[i][j]);
                        if (j - 1 >= 0) {
                            grid[i][j] = Integer.min(grid[i - 1][j - 1] + 2, grid[i][j]);
                        }
                        if (j + 1 < grid[0].length) {
                            grid[i][j] = Integer.min(grid[i - 1][j + 1] + 2, grid[i][j]);
                        }
                    }
                    if (i + 1 < grid.length) {
                        grid[i][j] = Integer.min(grid[i + 1][j] + 1, grid[i][j]);
                        if (j - 1 >= 0) {
                            grid[i][j] = Integer.min(grid[i + 1][j - 1] + 2, grid[i][j]);
                        }
                        if (j + 1 < grid[0].length) {
                            grid[i][j] = Integer.min(grid[i + 1][j + 1] + 2, grid[i][j]);
                        }
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
                if (i - 1 >= 0) {
                    grid[i][j] = Integer.min(grid[i - 1][j] + 1, grid[i][j]);
                    if (j - 1 >= 0) {
                        grid[i][j] = Integer.min(grid[i - 1][j - 1] + 2, grid[i][j]);
                    }
                    if (j + 1 < grid[0].length) {
                        grid[i][j] = Integer.min(grid[i - 1][j + 1] + 2, grid[i][j]);
                    }
                }
                if (i + 1 < grid.length) {
                    grid[i][j] = Integer.min(grid[i + 1][j] + 1, grid[i][j]);
                    if (j - 1 >= 0) {
                        grid[i][j] = Integer.min(grid[i + 1][j - 1] + 2, grid[i][j]);
                    }
                    if (j + 1 < grid[0].length) {
                        grid[i][j] = Integer.min(grid[i + 1][j + 1] + 2, grid[i][j]);
                    }
                }
                if (j + 1 < grid[0].length) {
                    grid[i][j] = Integer.min(grid[i][j + 1] + 1, grid[i][j]);
                }
                if (j - 1 >= 0) {
                    grid[i][j] = Integer.min(grid[i][j - 1] + 1, grid[i][j]);
                }

            }
        }
        return grid;
    }
}
