// Code By Sneha Varshney
import java.util.Scanner;

class Funny_Hand{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int max = Math.max(a,b);
            int min = Math.min(a,b);
            if(max - min > 2 || max - min <= 0){
                System.out.println("0");
            }else if(min == 1 || max == n || max - min == 2){
                System.out.println("1");
            }else{
                System.out.println("2");
            }
            sc.close();
        }
    }
}