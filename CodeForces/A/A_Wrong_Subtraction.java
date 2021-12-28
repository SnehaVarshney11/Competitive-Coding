package CodeForces.A;
import java.util.Scanner;

public class A_Wrong_Subtraction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int last_digit;
        for(int i = 1; i <= k; i++){
            last_digit = n % 10;
            if(last_digit == 0){
                n /= 10;
            }else{
                n -= 1;
            }
        }
        System.out.println(n);
    }
}