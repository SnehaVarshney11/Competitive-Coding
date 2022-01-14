package CodeForces.A;
import java.util.Scanner;

public class A_New_Year_and_Hurry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = 240 - k, sum = 0, c = 0;

        for(int i = 1; i <= n; i++){
            sum += 5 * i;

            if(sum > res){
                break;
            }
            c = c + 1;
        }
        System.out.println(c);
    }
}