import java.util.*;
public class a1 {
   static int n=0;
   static int n2=0;
   static int n3=0;
   public void merge(int []arr,int i,int m,int r) {
	   int arr1[]=new int[r-i+1];
	   int n1=0;
	   int a=i;
	   int b=m+1;
	   int c=r;
	   while(a<=m && b<=c) {
		   if(arr[a]<=arr[b]) {
			   arr1[n1]=arr[a];
			   a++;
			   n1++;
		   }else if(arr[a]>=arr[b]) {
			   arr1[n1]=arr[b];
			   b++;
			   n1++;
		   }
	   }
	   while(a<=m) {
		   arr1[n1]=arr[a];
		   a++;
		   n1++;
	   }
	   while(b<=c) {
		   arr1[n1]=arr[b];
		   b++;
		   n1++;
	   }
	   a=i;
	   for(int j=0;j<arr1.length;j++) {
		   arr[a]=arr1[j];
		   a++;
	   }
   }
   public void mergesort(int arr[],int i,int n) {
	   if(i<n) {
        int m=(n+i)/2;
        n2++;
        System.out.println("Dividing step = "+n2);
        mergesort(arr,i,m);
        n2++;
        System.out.println("Dividing step = "+n2);
        mergesort(arr,m+1,n);
        n3++;
        System.out.println("Merging step = "+n3);
        merge(arr,i,m,n);
	   }
	   
   }
   void selsort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        
        {   
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            }
        }
    }
   public static void main(String args[]) {
	   int n;
	   Scanner sc=new Scanner(System.in);
	   n=sc.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++) {
		   arr[i]=sc.nextInt();
	   }
	   a1 a=new a1();
	   a.mergesort(arr,0,arr.length-1);
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
   }
}