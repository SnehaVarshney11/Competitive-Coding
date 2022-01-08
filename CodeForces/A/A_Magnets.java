package CodeForces.A;
import java.util.Scanner;

public class A_Magnets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        int count = 0;
        int a, b = 0;
        for(int i = 0; i < n; i++){
            a = sc.nextInt();
            if(a != b){
                count++;
            }
            b = a;
        }
        System.out.println(count);
    }
}