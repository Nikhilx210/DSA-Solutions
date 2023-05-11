public class average {
    void ava(int a, int b){
        double ans=(double) (a+b)/2;
        System.out.println(ans);
    }
    void ava(float a ,float b){
        float ans=(float) (a+b)/2;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        average obj =new average();
        float b=(float)1/2;
        float d=(float)3/2;
        obj.ava(1, 2);
        obj.ava(b,d);
        System.out.println(b);
    }
    
}
