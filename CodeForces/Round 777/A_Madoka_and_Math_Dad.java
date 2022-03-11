import java.util.Scanner;

public class A_Madoka_and_Math_Dad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n <= 2){
                System.out.println(n);
                continue;
            }
            String s1 = "";
            String s2 = "";
            int c1 = 0, c2 = 0;
            int x = 1;

            while(c1 < n){
                c1 += x;
                s1 += Integer.toString(x);
                if(x == 1){
                    x = 2;
                }else{
                    x = 1;
                }
                c2 += x;
                s2 += Integer.toString(x);
            }
            if(c2 == n){
                System.out.println(s2);
            }
            else if(c1 == n){
                System.out.println(s1);
            }
            else{
                System.out.println(s2.substring(0, s2.length() - 1));
            }
        }
    }
}