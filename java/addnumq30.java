public class addnumq30 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=0;i<args.length;i++){
            try {
                sum+=Integer.parseInt(args[i]);
            } catch (Exception e) {
                System.out.println(args[i]+" will not be included as it is not a number");
            }
        }
        System.out.println(sum);
    }
    
}