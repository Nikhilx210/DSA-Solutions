import java.util.ArrayList;

public class partitionequalsubset {

    static int equalPartition(int N, int arr[]){
        // code here
        int s=0;
        for(int k=0;k<N;k++){
            s+=arr[k];
        }
        if(s%2!=0){
            return -1;
        }
        ArrayList<Integer> diff_holder = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int d = Math.abs(arr[0]+arr[1]);
        int f = Math.abs(arr[0]-arr[1]);
        diff_holder.add(d);
        diff_holder.add(f);
        for(int i=2;i<N;i++){
            if(i==N-1){
                int len = diff_holder.size();
                System.out.println(len);
                len=len-1;
                while(len>=0){
                    int add = Math.abs(diff_holder.get(len)+arr[i]);
                    int sub = Math.abs(diff_holder.get(len)-arr[i]);
                    ans.add(add);
                    ans.add(sub);
                    len--;
                }
            }
            else{
                int len = diff_holder.size();
                len=len-1;
                while(len>=0){
                    int add = Math.abs(diff_holder.get(len)+arr[i]);
                    int sub = Math.abs(diff_holder.get(len)-arr[i]);
                    diff_holder.add(add);
                    diff_holder.add(sub);
                    len--;
                }
                for(int j=0;j<(2^(i-2));j++){
                    diff_holder.remove(0);
                }
            }
        }
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)==0){
                return 1;
            }
        }
        return -1;
    }
}
