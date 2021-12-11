import java.util.Scanner;
class Sleepy_Chef{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            String s = sc.next();
            int c = 0, ans = 0;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '0'){
                    c++;
                    if(c >= k){
                        ans++;
                        c = 0;
                    }
                }
                if(s.charAt(i) == '1'){
                    c = 0;
                }
            }
            System.out.println(ans);
        }
    }
}