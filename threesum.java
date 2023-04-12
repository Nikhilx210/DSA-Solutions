
import java.util.*;

import javax.swing.SortOrder;

public class threesum {
    public  List<List<Integer>> threeSum(int[] nums){
        int z=nums.length;
        List<List<Integer>> lst=new ArrayList<>();
        Arrays.sort(nums);
        int neg=0;
        int zro =0;
        for(int i=0;i<z;i++){
            if(nums[i]<0){
                neg++;
            }
            else if(nums[i]==0){
                zro++;
            }
        }
        if(zro>=3){
            lst.add(Arrays.asList(0,0,0));
        }
        for (int i=0;i<neg;i++){
            if(i==0 ||nums[i]!=nums[i-1]){
                int pvt = -(nums[i]);
                int minind =i+1;
                int maxind =z-1;
                while(minind<maxind){
                    int s=nums[minind]+nums[maxind];
                    if(s<pvt){
                        minind++;
                    }
                    else if(s>pvt){
                        maxind--;
                    }
                    else{
                        lst.add(Arrays.asList(nums[i],nums[minind],nums[maxind]));
                        minind++;
                        maxind--;
                    }
                }
            }   
        }
        int pq = lst.size();
        for(int j=1;j<pq;j++){
            List<Integer> lst1=lst.get(j);
            List<Integer> lst2=lst.get(j-1);
            if((lst1.equals(lst2))){
                lst.remove(j-1);
                pq-=1;
                j--;
            }
        }
        return lst;
    
    }
    public static void main(String[] args) {
        threesum a = new threesum();
        int arr[]=
        {-2,0,3,-1,4,0,3,4,1,1,1,-3,-5,4,0};
        int arr210[]={0,0,0};
        System.out.println(a.threeSum(arr)
        );
    }
}
