import java.util.*;
import java.util.Collection;
import java.util.Collections;

public class trappingrain {
    public int trap(int[] height) {
        int z=height.length ;
        int[] arr1=new int[z];
        int[] arr2=new int[z];
        int ans=0;
        for(int i=0;i<z;i++){
            if(i==0){
                arr1[i]=height[i];
            }
            else{
            arr1[i]=Integer.max(height[i],arr1[i-1]);
            }
        }
        for(int i=z-1;i>=0;i--){
            if(i==z-1){
                arr2[i]=height[i];
            }
            else{
            arr2[i]=Integer.max(height[i],arr2[i+1]);
            }
        }
        for(int i=0;i<z;i++){
            int a= Integer.min(arr1[i], arr2[i]);
            ans+=a-height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        trappingrain a = new trappingrain();
        int arr[]={4,2,0,3,2,5};
        int arr210[]={1,2,3,4,5,6};
        System.out.println(a.trap(arr));
        
        
    }
}
