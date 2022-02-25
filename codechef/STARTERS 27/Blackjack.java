import java.util.Scanner;

class Blackjack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(21 - (a+b) > 10){
                System.out.println("-1");
            }else{
                System.out.println(21-(a+b));
            }
        }
    }
}