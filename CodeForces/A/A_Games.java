package CodeForces.A;
import java.util.Scanner;

public class A_Games{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        int res = 0;
        int[] home = new int[n];
        int[] guest = new int[n];

        for(int i = 0; i < n; i++){
            home[i] = sc.nextInt();
            guest[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(home[i] == guest[j]){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}