public class sumq29 {
    void total(int...a){
    int sum=0;
    for (int i=0;i<a.length;i++){
        sum=sum+a[i];
    }
    System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int brr[]={345,374,874};
        sumq29 obj=new sumq29();
        obj.total(arr);
        obj.total(brr);
        obj.total(1,2,3,4,5,6,7,8,9);

    } 
}
