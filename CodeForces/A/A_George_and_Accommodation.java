package CodeForces.A;
import java.util.Scanner;

public class A_George_and_Accommodation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++){
            int pi = sc.nextInt();
            int qi = sc.nextInt();

            if((qi - pi) >= 2){
                count++;
            }
        }
            System.out.println(count);
    }
}