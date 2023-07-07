public class num {
    public int nummber(int[]num){
        String s="";
        for(int i=0;i<num.length;i++){
            s+=num[i];
        }
        return (Integer.parseInt(s));
    }
    public static void main(String[] args) {
        num a = new num();
        int arr[]={2,3,5,7,1};
        int arr1[]={2,3,5,1,7};
        int b=a.nummber(arr);
        int c=a.nummber(arr1);
        System.out.println(a.nummber(arr));
        System.out.println(a.nummber(arr1));
        if(b>c){
            System.out.println("ji");
        }
    }
    
}
