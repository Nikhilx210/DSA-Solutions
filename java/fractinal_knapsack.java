import java.util.*;

public class fractinal_knapsack {
    class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        double ans=0;
        Arrays.sort(arr, new Comparator<Item>(){
            @Override
            public int compare(Item o1,Item o2){
                double a2=(double)o2.value/(double)o2.weight;
                double a1=(double)o1.value/(double)o1.weight;
                
                if(a2-a1>0){
                    return 1;
                }else{
                    return -1;
                }
                // return ((o2.value/o2.weight)-(o1.value/o1.weight));
            }
        });
        for(int i=0;i<n;i++){
            System.out.print(arr[i].value+ "--------- " + arr[i].weight);
            System.out.println();
        }
        
        for(int i=0;i<n;i++){
            if(W>0 && W>=arr[i].weight){
                ans+=arr[i].value;
                W-=arr[i].weight;
            }
            else if(W>0 && W<arr[i].weight){
                double p1= arr[i].value;
                double p2= arr[i].weight;
                double perval= p1/p2;
                ans+=perval*W;
                break;
            }
            else{
                break;
            }
        }
        return ans;
    }
}
