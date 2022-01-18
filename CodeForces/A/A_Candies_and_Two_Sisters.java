package CodeForces.A;
import java.util.Scanner;

public class A_Candies_and_Two_Sisters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n % 2 != 0){
                System.out.println((n-1)/2);
            }else{
                System.out.println((n/2)-1);
            }
        }
    }
}