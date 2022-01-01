package CodeForces.B;
import java.util.Scanner;

public class B_Balanced_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int sum1 = 0,sum2 = 0;
            int n = sc.nextInt();

            if(n % 4 != 0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                for(int i = 2; i <= n; i+=2){
                    System.out.print(i + " ");
                    sum1 += i;
                }
                for(int i = 1; i < n-2; i += 2){
                    System.out.print(i + " ");
                    sum2 += i;
                }
                System.out.println(sum1 - sum2);
            }
        }
    }
}