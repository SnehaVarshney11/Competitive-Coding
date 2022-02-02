package Practice;
import java.util.Scanner;

class Valleys_and_Hills{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = "";
            if(n > m){
                n = n-m;
                while(m != 0){
                    s += "01";
                    m--;
                }
                while(n != 0){
                    s += "010";
                    n--;
                }
            }
            else if(n < m){
                m = m-n;
                while(n != 0){
                    s += "10";
                    n--;
                }
                while(m != 0){
                    s += "101";
                    m--;
                }
            }
            else{
                while(n+1 != 0){
                    s += "01";
                    n--;
                }
            }
            System.out.println(s.length());
            System.out.println(s);
        }
    }
}