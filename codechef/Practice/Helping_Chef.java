package Practice;
import java.util.Scanner;

class Helping_Chef{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n < 10){
                System.out.println("Thanks for helping Chef!");
            }else{
                System.out.println("-1");
            }
        }
    }
}