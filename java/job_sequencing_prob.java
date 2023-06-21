import java.util.*;

public class job_sequencing_prob {
    class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z; 
        }
    }
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        int deadlinemax = Integer.MIN_VALUE;
        int ans[]=new int [2];
        Map<Integer,Integer> dic = new HashMap<Integer,Integer>(); 
        for(int i=0;i<n;i++){
            deadlinemax=Integer.max(deadlinemax, arr[i].deadline);
        }
        
        Arrays.sort(arr, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                // if(o1.deadline==o2.deadline){
                    return (o2.profit-o1.profit);
                
                // return (o1.deadline-o2.deadline);
            }
            
        });
        int anspnt =0;
        int ansprofit=0;
        for(int i=0;i<n;i++){
            if(deadlinemax>0){
                Boolean canadd = false;
                int index=0;
                for(int j=arr[i].deadline;j>=1;j--){
                    if(dic.containsKey(j)){
                        canadd = true;
                    }
                    else{
                        canadd =false;
                        index=j;
                        break;
                    }
                }
                if(!canadd){
                    ansprofit+= arr[i].profit;
                    anspnt++;
                    dic.put(index,1);
                    deadlinemax--;
                    
                }
            }
        }
        ans[0]=anspnt;
        ans[1]=ansprofit;
        return ans;
    }
}
