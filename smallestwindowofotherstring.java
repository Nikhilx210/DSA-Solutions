import java.util.Arrays;

public class smallestwindowofotherstring {
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        int zs=s.length();
        int zp=p.length();
        int arrs[] = new int[26];
        int arrp[] = new int[26];
        int count =zp;
        int anslen = Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<zp;i++){
            int alpha = p.charAt(i)-'a';
            arrp[alpha]+=1;
        }                                                    
       
        int lend =0;
        int rend =0;
        for (int i=0;i<zs;i++){
            int alpha = s.charAt(i)-'a';
            if(arrp[alpha]==0){
                rend+=1;
                continue;
            }
            else if(arrp[alpha]>0){
                boolean flag=true;
                if(count>0){
                    if(arrp[alpha]>arrs[alpha]){
                        count-=1;
                        arrs[alpha]+=1;
                        rend+=1;
                        flag=false;
                    }
                    else if(arrp[alpha]<=arrs[alpha]){
                        arrs[alpha]+=1;
                        rend+=1;
                    }
                }
                if(count==0){
                    rend=i;
                    if(flag){
                        arrs[alpha]++;
                    }
                    for(int j=lend;j<rend+1;j++){
                        int beta = s.charAt(j)-'a';
                        if(arrs[beta]!=0){
                            if(arrp[beta]==arrs[beta]){
                                break;
                            }
                            else if(arrp[beta]<arrs[beta]){
                                lend+=1;
                                arrs[beta]-=1;
                            }
                        }
                        else{
                            lend+=1;
                        }
                    }
                    if(anslen>rend-lend+1){
                        ans = s.substring(lend, rend+1);
                        anslen = ans.length();
                    }
                }
            }
        }
        if(ans.compareTo("")==0){
            ans= "-1";
        }
        return ans;
    }
    public static void main(String[] args) {
        smallestwindowofotherstring a = new smallestwindowofotherstring();
        String s = "timetopractice";
        String p = "toc";
        String answer = smallestWindow(s, p);
        System.out.println(answer);
    }
}
