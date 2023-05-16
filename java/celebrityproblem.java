public class celebrityproblem {
    int celebrity(int M[][], int n)
    {
    	// code here 
        Boolean row1=false;
        int a=-1;
        int b=-1;
    	for(int i=0;i<n;i++){
            if(M[0][i]==1){
                row1=true;
                if(a<0){
                    a=i;
                }
                else{
                    b=i;
                    if(M[a][b]==1 && M[b][a]==1){
                        a=-1;
                        b=-1;
                    }
                        else if(M[a][b]==1){
                        a=b;
                        b=-1;
                    }
                    else if(M[b][a]==1){
                        b=-1;
                    }
                }
            }
        }
        int ans=0;
        if(!row1){
            for(int i=1;i<n;i++){
                    if(M[i][0]==0){
                        ans=1;
                        break;
                }
            }
            if(ans==0){
                return 0;
            }
        }
        if(a<0){
            return -1;
        }
        else{
            for(int i=0;i<n;i++){
                if(a!=i){
                    if(M[a][i]!=0){
                        return -1;
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(a!=i){
                    if(M[i][a]!=1){
                        return -1;
                    }
                }
            }
        }
        return a;
    }
}
