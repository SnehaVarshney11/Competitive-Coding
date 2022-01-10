package CodeForces.A;
import java.util.Scanner;

public class A_Arrival_of_the_General{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        int maxval = 0, minval = 1000;
        int maxindex = 0, minindex = 0;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();

            if(x > maxval){
                maxindex = i;
                maxval = x;
            }
            if(x <= minval){
                minindex = i;
                minval = x;
            }
        }
        if(maxindex > minindex){
            System.out.println((maxindex-1)+(n-minindex)-1);
        }else{
            System.out.println((maxindex-1)+(n-minindex));
        }
    }
}