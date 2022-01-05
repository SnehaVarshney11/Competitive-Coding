package CodeForces.A;
import java.util.Scanner;

public class A_Hulk{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.print("I hate" + " ");
            }else{
                System.out.print("I love" + " ");
            }
            if(i != n-1){
                System.out.print("that" + " ");
            }else{
                System.out.print("it" + " ");
            }
        }
    }
}