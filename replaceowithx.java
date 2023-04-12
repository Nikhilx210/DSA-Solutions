public class replaceowithx {
    static void xchanger(char a[][],int x,int y) {
        int row =a.length;
        int col =a[0].length;
        if(x>=row || y>=col || x<0 || y<0 ){
            return ;
        }
        else if(a[x][y]!='O'){
            return ;
        }
        else{
            a[x][y]='$';
        }
        xchanger(a, x+1, y);
        xchanger(a, x, y+1);
        xchanger(a, x, y-1);
        xchanger(a, x-1, y);
        
    }
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        for(int i=0;i<n;i++){
            int j=0;
            if(a[i][j]=='O'){
                xchanger(a,i,j);
            }
        }
        for(int i=0;i<n;i++){
            int j=m-1;
            if(a[i][j]=='O'){
                xchanger(a,i,j);
            }
        }
        for(int j=1;j<m;j++){
            int i=0;
            if(a[i][j]=='O'){
                xchanger(a,i,j);
            }
        }
        for(int j=1;j<m;j++){
            int i=n-1;
            if(a[i][j]=='O'){
                xchanger(a,i,j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='O'){
                    a[i][j]='X';
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='$'){
                    a[i][j]='O';
                }
            }
        }
        System.out.println("aafnjdfsidhafalj");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        return a;
    }
    public static void main(String[] args) {
        char M[][] = new char[][] { {'X', 'X', 'X', 'X'}, 
        {'X', 'O', 'X', 'X'}, 
        {'X', 'O', 'O', 'X'}, 
        {'X', 'O', 'X', 'X'}, 
        {'X', 'X', 'O', 'O'} };
        char M1[][] = new char[][] { { '0', '1' },
                                  { '1', '0' },
                                  { '1', '1'},
                                  { '1', '0' }
                                   };
        
        fill(5,4,M);

    }
}
