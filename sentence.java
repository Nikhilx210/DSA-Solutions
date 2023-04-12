public class sentence {

    public static void main(String[] args) {
        String a ="the quick brown fox jumps over the lazy dog";
        StringBuffer d= new StringBuffer("the quick brown fox jumps over the lazy dog");
        System.out.println("character at 12 is : "+a.charAt(12));
        System.out.println(a.length());
        int p=0;
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)=='i' && a.charAt(i+1)=='s'){
                p=1;
                break;
            }
            else{
                continue;
            }
        }
        if(p==1){
            System.out.println(" 'is' present in the string");
        }
        else{
            System.out.println(" 'is' not present in the string");
        }
        d.append("and killed it");
        String b=" and killed it";
        String c=a+b;
        System.out.println(c);
        int q=0;
        int m=a.length()-3;
            if (a.charAt(m)=='d' && a.charAt(m+1)=='o'&& a.charAt(m+2)=='g' ){
                q=1;
            }
        if(q==1){
            System.out.println(" 'dog' present at end  in the string");
        }
        else{
            System.out.println(" 'dog' not present at end in the string");
        }
        if(a.compareTo("The quick brown Fox jumps over the lazy Dog")==0){
            System.out.println(" initial strings are equal");
        }
        else{
            System.out.println(" initial strings not equal");
        }
        StringBuffer e= new StringBuffer("The quick brown Fox jumps over the lazy Dog");
        if(d==e){
            System.out.println(" initial2 strings are equal");
        }
        else{
            System.out.println(" initial2 strings not equal");
        } 
        if(a.compareTo("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG")==0){
            System.out.println(" caps strings are equal");
        }
        else{
            System.out.println(" caps strings not equal");
        }
        d.replace(0, 3,"A");
        System.out.println(d);
        StringBuffer f=new StringBuffer(d.substring(1, 17));
        StringBuffer g=new StringBuffer(d.substring(18));
        System.out.println(f);
        System.out.println(g);
        String h= a.substring(16,19);
        System.out.println(h);
        String i= a.substring(40,43);
        System.out.println(i);
        String j=a.toLowerCase();
        System.out.println(j);
        String k=a.toUpperCase();
        System.out.println(k);
        int pos=0;
        for (int x=1;x<a.length();x++){
            if (a.charAt(x)=='e'){
                pos=x;
            }
        }
        System.out.println(pos);
    }
    
}
