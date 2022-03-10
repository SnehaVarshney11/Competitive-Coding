import java.util.Scanner;

public class A_Playoff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println((1 << n) -1);
        }
    }
}