package CodeForces.A;
import java.util.Scanner;

public class A_Soldier_and_Bananas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int k = sc.nextInt(); // cost of bananas 
        int n = sc.nextInt(); // inital no of dollars   
        int w = sc.nextInt(); // no of bananas he wants

        int sum = k;
        for(int i = 2; i <= w; i++){
            sum += i * k;
        }
        if(sum <= n){
            System.out.println("0");
            System.exit(0);
        }
        System.out.println(sum - n);
    }
}