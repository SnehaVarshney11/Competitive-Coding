package CodeForces.B;
import java.util.Scanner;

public class B_Anti_Fibonacci_Permutation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            for(int i = n; i > 0; i--){
                for(int j = n; j > 0; j--){
                    if(n-j+1 == i){
                        System.out.print(1 + " ");
                    }
                    if(j != 1){
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}