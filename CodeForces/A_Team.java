package CodeForces;

import java.util.Scanner;

public class A_Team{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
    
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a + b + c >= 2){
                ans += 1;
            }
        }
        System.out.println(ans);    
        sc.close();; 
    }
}