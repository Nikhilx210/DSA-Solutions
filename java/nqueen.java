import java.util.ArrayList;

// import java.util.ArrayList;

// // User function Template for Java

// class Solution{
    
//     public static void matrix_changes(int mat[][],int x,int y,int n){
//           for(int i=x;i<n;i++){
//               mat[i][y]=1;
//           }
//           int p=x;
//           int q=y;
//           while(p<n && q<n){
//               mat[p][q]=1;
//               p=p+1;
//               q=q+1;
//           }
//           p=x;
//           q=y;
//           while(p<n && q>=0){
//               mat[p][q]=1;
//               p=p+1;
//               q=q-1;
//           }
//       }
//       public static void rematrix_changes(int mat[][],int x,int y,int n){
//           for(int i=x;i<n;i++){
//               mat[i][y]=0;
//           }
//           int p=x;
//           int q=y;
//           while(p<n && q<n){
//               mat[p][q]=0;
//               p=p+1;
//               q=q+1;
//           }
//           p=x;
//           q=y;
//           while(p<n && q>=0){
//               mat[p][q]=0;
//               p=p+1;
//               q=q-1;
//           }
//       }
//       public static void best_orientation(int mat[][],ArrayList<ArrayList<Integer>>ans, int n ,ArrayList<Integer>currorien ,int x ,int y,int queen){
//           ArrayList<Integer> arr = new ArrayList<>(currorien);
//           if(queen==0){
//               ans.add(arr);
//               //currorien.remove(currorien.size()-1);
//               return ;
//           }
//           //else{
//               // if(mat[x][y]==1){
//               //     System.out.println(2);
//               //     return;
//               // }
//               else{
//                   for(int i=0;i<n;i++){
//                       if(mat[x][i]==0){
//                       currorien.add(i+1);
//                      System.out.println(currorien);
//                       matrix_changes(mat, x, i, n);
  
//                       best_orientation(mat, ans, n, currorien, x+1, i,queen-1);
//                       rematrix_changes(mat, x, i, n);
//                       currorien.remove(currorien.size()-1);

//                   }
//               }
//               }
             
//           }
//      // }
//       static ArrayList<ArrayList<Integer>> nQueen(int n) {
//           // code here
//           ArrayList<ArrayList<Integer>> ans =new ArrayList<>();
//           ArrayList<Integer> currorien =new ArrayList<>();
//           int mat[][] = new int [n][n];
//           best_orientation(mat ,ans, n, currorien,0,0,n);
//           return ans;
//       }
  
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> ans =new ArrayList<>();
//         ans=nQueen(5);
//         System.out.println(ans);

//     }
// }
class Solution{
    static boolean isvalid(int x, int y, int arr[][]) {
        for (int i = 0; i < arr[0].length; i++) {
            if (i != y && arr[x][i] == 1) {
                return false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != x && arr[i][y] == 1) {
                return false;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (x - i >= 0 && y - i >= 0 && arr[x - i][y - i] == 1) {
                return false;
            }
            if (x - i >= 0 && y + i < arr.length && arr[x - i][y + i] == 1) {
                return false;
            }
            if (x + i < arr.length && y - i >= 0 && arr[x + i][y - i] == 1) {
                return false;
            }
            if (x + i < arr.length && y + i < arr.length && arr[x + i][y + i] == 1) {
                return false;
            }
        }
        return true;
    }

    static void soln(int n, int x, int y, ArrayList<ArrayList<Integer>> A, int[][] arr, ArrayList<Integer> a) {
        if (isvalid(x, y, arr)) {
            if (x == n - 1) {
                a.add(y+1);
                A.add(new ArrayList<>(a));
                a.remove(a.size() - 1);
                return;
            }
            arr[x][y] = 1;
            a.add(y+1);
            for (int i = 0; i < n; i++) {
                soln(n, x + 1, i, A, arr, a);
            }
            a.remove(a.size() - 1);
            arr[x][y] = 0;
        }
    }

    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        int arr[][] = new int[n][n];
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            soln(n, 0, i, A, arr, a);
        }
        return A;

    }
}
