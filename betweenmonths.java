import java.util.*;
public class betweenmonths {
    void months(int a, int b){
        String months []={"jan","feb","march","ap","may","june","july","august","september","october","november","december"};
        Calendar c= Calendar.getInstance() ;
        for (int i=a+1;i<b;i++){
            System.out.println(months[i]);   
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter date 1");
        int date1=sc.nextInt(); 
        if (date1>12){
            System.out.println("enter correct month between 1 to 12");
            date1=sc.nextInt();
        }
        System.out.println("enter date 2");
        int date2=sc.nextInt();
        if (date2>12){
            System.out.println("enter correct month between 1 to 12");
            date2=sc.nextInt();
        }
        betweenmonths obj =new betweenmonths();
        obj.months(date1, date2);
        
    }


}
