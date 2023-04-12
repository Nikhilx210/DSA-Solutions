public class wordsearch {
    public static boolean rightword(char[][] board,String word, int x , int y ,String dir,int inde){
    int row = board.length;
    int col = board[0].length;
    int wordlen = word.length();
    System.out.println(wordlen);
    int index  =inde;
    if(wordlen==0){
        return true;
    }
    char alpha =word.charAt(index);
    int a=x;
    int b=y;
        if(dir.compareTo("left")==0){
            if( a+1<row && b<col && a>=0 && b>=0 && alpha==board[a+1][b]){
                if(rightword(board, word.substring(index+1, wordlen), a+1, b, "up",index+1)){
                    return true;
                }
                
            }
            if( a<row && b<col && a-1>=0 && b>=0 && alpha==board[a-1][b]){
                if(rightword(board, word.substring(index+1, wordlen), a-1, b, "down",index+1)){
                    return true;
                }
            }
            if( a<row && b+1<col && a>=0 && b>=0 && alpha==board[a][b+1]){
                if(rightword(board, word.substring(index+1, wordlen), a, b+1, "left",index+1)){
                    return true;
                }
            }
            return false;
        }
        else if(dir.compareTo("right")==0){
            if(a+1<row && b<col && a>=0 && b>=0 && alpha==board[a+1][b]){
                if(rightword(board, word.substring(index+1, wordlen), a+1, b, "up",index+1)){
                    return true;
                }
                a=x;
                b=y;
                
            }
            if(a<row && b<col && a-1>=0 && b>=0 && alpha==board[a-1][b]){
                if(rightword(board, word.substring(index+1, wordlen), a-1, b, "down",index+1)){
                    return true;
                }
                a=x;
                b=y;
                
            }
            if(a<row && b<col && a>=0 && b-1>=0 && alpha==board[a][b-1]){
                if(rightword(board, word.substring(index+1, wordlen), a, b-1, "right",index+1)){
                    return true;
                }
            }
            return false;
        }
        else if(dir.compareTo("up")==0){
            if(a+1<row && b<col && a>=0 && b>=0 && alpha==board[a+1][b]){
                if(rightword(board, word.substring(index+1, wordlen), a+1, b, "up",index+1)){
                    return true;
                }
                a=x;
                b=y;
            }
            if( a<row && b-1<col && a>=0 && b>=0 && alpha==board[a][b-1]){
                if(rightword(board, word.substring(index+1, wordlen), a, b-1, "right",index+1)){
                    return true;
                }
                a=x;
                b=y;
            }
            if( a<row && b+1<col && a>=0 && b>=0 && alpha==board[a][b+1]){
                if(rightword(board, word.substring(index+1, wordlen), a, b+1, "left",index+1)){
                    return true;
                }   
            }
            return false;
            
        }
        else if(dir.compareTo("down")==0){
            if(a+1<row && b<col && a>=0 && b>=0 && alpha==board[a+1][b]){
                if(rightword(board, word.substring(index+1, wordlen), a+1, b, "up",index+1)){
                    return true;
                }
                a=x;
                b=y;
            }
            if(a<row && b<col && a>=0 && b-1>=0 &&alpha==board[a][b-1]){
                if(rightword(board, word.substring(index+1, wordlen), a, b-1, "right",index+1)){
                    return true;
                } 
                a=x;
                b=y;  
            }
            if( a<row && b+1<col && a>=0 && b>=0 && alpha==board[a][b+1]){
                if(rightword(board, word.substring(index+1, wordlen), a, b+1, "left",index+1)){
                    return true;
                }
            }   
            return false;
        }
        else if(dir.compareTo("null")==0){
                        if(a+1<row && b<col && a>=0 && b>=0 && alpha==board[a+1][b]){
                if(rightword(board, word.substring(index+1, wordlen), a+1, b, "up",index+1)){
                    return true;
                }
                a=x;
                b=y;
            }
            if(a<row && b<col && a>=0 && b-1>=0 &&alpha==board[a][b-1]){
                if(rightword(board, word.substring(index+1, wordlen), a, b-1, "right",index+1)){
                    return true;
                } 
                a=x;
                b=y;  
            }
            if(a<row && b<col && a-1>=0 && b>=0 && alpha==board[a-1][b]){
                if(rightword(board, word.substring(index+1, wordlen), a-1, b, "down",index+1)){
                    return true;
                }
                a=x;
                b=y;
                
            }            
            if( a<row && b+1<col && a>=0 && b>=0 && alpha==board[a][b+1]){
                if(rightword(board, word.substring(index+1, wordlen), a, b+1, "left",index+1)){
                    return true;
                }
            }   
            
            return false;

        }
    return false;

}
public boolean exist(char[][] board, String word) {
    int row = board.length;
    int col = board[0].length;
    int z = word.length();
    String nulll = "null";
    int ind=0;
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(board[i][j]==word.charAt(0)){
                if(rightword(board, word.substring(0, z), i, j, nulll,0)){
                    return true;
                }

            }
        }
    }
    return false;

}
}
