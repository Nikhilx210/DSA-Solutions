import java.util.Arrays;
import java.util.Comparator;

public class largestnumberinarr {
    public String printLargest(String[] arr) {
        // code here
        // int z= arr.length;
        // if(z==1) {
        //     System.out.println(1);
        //     //return arr[0];
        // }
        // int i=-1;
        // int pvt=z-1;
        // for (int j=0;j<z;j++){
        //     System.out.println(arr[j]);
        //     if(arr[j].charAt(0)>arr[pvt].charAt(0)){
        //         i+=1;
        //         String c = arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=c;  
        //     }
        //     else if(arr[j].charAt(0)==arr[pvt].charAt(0)){
        //         int p =arr[j].length();
        //         int q =arr[pvt].length();
        //         if(p>q){
        //             int pq=p-q;
        //             String mn = arr[pvt].charAt(q-1)+"";
        //             String man = mn.repeat(pq);
        //             String mnm= arr[pvt]+ man;
        //             int ab = Integer.parseInt(mnm);
        //             if(ab<Integer.parseInt(arr[j])){
        //                 i+=1;
        //                 String c = arr[i];
        //                 arr[i]=arr[j];
        //                 arr[j]=c;
        //             }
        //         }
        //         else if(p==q){
        //             if(Integer.parseInt(arr[j])>=Integer.parseInt(arr[pvt])){
        //                 i+=1;
        //                 String c = arr[i];
        //                 arr[i]=arr[j];
        //                 arr[j]=c;  
        //             } 
        //         }
        //         else{
        //             int pq=q-p;
        //             int ab = Integer.parseInt(arr[j])*(10^pq);
        //             if(ab>Integer.parseInt(arr[pvt])){
        //                 i+=1;
        //                 String c = arr[i];
        //                 arr[i]=arr[j];
        //                 arr[j]=c;
        //             }
        //         }
        //     }
        //     else if(j==z-1){
        //         i+=1;
        //         String c = arr[i];
        //         arr[i]=arr[z-1];
        //         arr[z-1]=c;
        //     }
        // }
        // String s="";
        // for (int j=0;j<z;j++){
        //     s+=arr[j];
        // }
        // System.out.println(s);
        // System.out.println(Arrays.toString(arr));
        // //return Arrays.toString(arr);


        // Arrays.sort(arr,new Comparator<String>() {


        //     @Override
        //     public int compare(String o1, String o2) {
        //         // TODO Auto-generated method stub
        //         int i =1;
        //         if(o1.charAt(0)<o2.charAt(0)){
        //             return 1;
        //         }
        //         else if(o1.charAt(0)>o2.charAt(0)){
        //             return -1;
        //         }
        //         else if((o1.charAt(0)==o2.charAt(0))){
        //             int p = o1.length();
        //             int q =o2.length();
        //             int pq =Integer.min(p,q);
        //             int bigone =Integer.max(p,q);
        //             int boom =0;
        //             while(i<pq){
        //                 if(o1.charAt(i)<o2.charAt(i)){
        //                     boom=1;
        //                     return 1;
                            
        //                 }
        //                 else if(o1.charAt(i)>o2.charAt(i)){
        //                     boom=1;
        //                     return -1;
        //                 }
        //                 else{
        //                     i++;
        //                 }
        //             }
        //             if(boom==0){
        //                 int m=0;
        //                 for(int j=i;j<bigone;j++){
        //                     if(p==q){
        //                         return -1;
        //                     }
        //                     else if(p>q && m<pq){
        //                         if(o1.charAt(j)>o1.charAt(m)){
        //                             return -1;
        //                         }
        //                         else if(o1.charAt(j)<o1.charAt(m)){
        //                             return 1;
        //                         }
        //                         else{
        //                             m++;
        //                         }
        //                         return -1;
        //                     }
        //                     else if(p<q && m<pq){
        //                         if(o2.charAt(j)>o2.charAt(m)){
        //                             return 1;
        //                         }
        //                         else if(o2.charAt(j)<o2.charAt(m)){
        //                             return -1;
        //                         }
        //                         else{
        //                             m++;
        //                         }
        //                         return 1;
        //                     }
        //                 }
        //             }
        //         }
        //     return -1;
        //     }  
            
        // });
        Arrays.sort(arr, new Comparator<String>()
        {
            // A comparison function which is used by
            // sort() in printLargest()
            @Override public int compare(String X, String Y)
            {
 
                // first append Y at the end of X
                String XY = X + Y;
 
                // then append X at the end of Y
                String YX = Y + X;
 
                // Now see which of the two
                // formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
        String ans=Arrays.toString(arr);
        return ans;
    }
    public static void main(String[] args) {
        largestnumberinarr a = new largestnumberinarr();
        String arr[]={"1","4","39","391","2","1"};
        int arr210[]={0,0,0};
        System.out.println(a.printLargest(arr));
        //System.out.println(a.printLargest(arr));
    }
    
}
