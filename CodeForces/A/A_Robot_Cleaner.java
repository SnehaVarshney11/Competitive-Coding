package CodeForces.A;
import java.util.Scanner;

public class A_Robot_Cleaner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int rb = sc.nextInt();
            int cb = sc.nextInt();
            int rd = sc.nextInt();
            int cd = sc.nextInt();
            int count = 0;
            boolean b = false;
            int dr = 1, dc = 1;

            while(!b){
                if(rb == rd || cb == cd){
                    break;
                }
                if(rb + dr > n || rb + dr < 1){
                    dr *= -1;
                }
                if(cb + dc > m || cb + dc < 1){
                    dc *= -1;
                }
                rb += dr;
                cb += dc;
                count++;
            }
            System.out.println(count);
        }
    }
}