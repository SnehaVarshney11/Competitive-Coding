import java.util.Scanner;

class Tyre_problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(n*2+(m*4));
        }
    }
}