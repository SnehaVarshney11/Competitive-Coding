package CodeForces;
import java.util.Scanner;

public class A_Bear_and_Big_Brother{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        
        while(a <= b){
            a = a * 3;
            b = b * 2;
            count++;
        }
        System.out.println(count);
    }
}