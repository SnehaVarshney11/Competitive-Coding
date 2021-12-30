package CodeForces.A;
import java.util.Scanner;

public class A_Vanya_and_Fence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] ar = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
            if(ar[i] > h){
                sum++;
            }
            sum++;
        }
        System.out.println(sum);
    }
}