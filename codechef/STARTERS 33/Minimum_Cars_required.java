//Solution By Sneha Varshney
import java.util.Scanner;

class Minimum_Cars_required{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(); //the number of friends.
            if(n%4 == 0){
                System.out.println(n/4);
            }else{
                System.out.println((n/4)+1);
            }
            sc.close();
        }
    }
}