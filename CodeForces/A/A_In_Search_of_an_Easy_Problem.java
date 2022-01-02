package CodeForces.A;
import java.util.Scanner;

public class A_In_Search_of_an_Easy_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        int[] ar = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
            if(ar[i] == 1){
                count++;
            }
        }
        if(count == 0){
            System.out.println("EASY");
        }else{
            System.out.println("HARD");
        }
    }
}