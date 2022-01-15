package CodeForces.A;
import java.util.Arrays;
import java.util.Scanner;

public class A_Restoring_Three_Numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int[] ar = new int[4];

        for(int i = 0; i < 4; i++){
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int c = ar[3] - ar[0];
        int b = ar[2] - c;
        int a = ar[3] - (b+c);

        System.out.println(a + " " + b + " " + c);
    }
}