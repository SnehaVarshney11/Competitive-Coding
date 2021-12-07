package CodeForces;

import java.util.Scanner;

public class A_Watermelon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        int w = sc.nextInt();
        if(w > 2){
            if(w % 2 == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
    }
}