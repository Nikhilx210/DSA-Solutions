import java.util.*;

public class commonelement {
    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<>();
        int maxdigit=Integer.MIN_VALUE;
        maxdigit =Integer.max(Integer.max(A[0],B[0]),C[0]);
        int a=0;
        int b=0;
        int c=0;
        while(a<n1 && b< n2 && c<n3){
            if(A[a]==B[b]&&B[b]==C[c]){
                int alpha =ans.size()-1;
                if(ans.size()==0 || ans.get(alpha)!=A[a]){
                    ans.add(A[a]);  
                }
                a++;
                b++;
                c++;

            }
            if(a<n1 && b< n2 && c<n3){
                maxdigit =Integer.max(Integer.max(A[a],B[b]),C[c]);
                if(A[a]<maxdigit){
                    a++;
                }
                if(B[b]<maxdigit){
                    b++;
                }
                if(C[c]<maxdigit){
                    c++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    int n1 = 3; 
    int []A = {3,3,3};
    int n2 = 3; 
    int []B = {3, 3, 3};
    int n3 = 3; 
    int []C = {3,3, 3};
    ArrayList<Integer> ans = new ArrayList<>();
    ans=commonElements(A, B, C, n1, n2, n3);
    System.out.println(ans);
    }
}
