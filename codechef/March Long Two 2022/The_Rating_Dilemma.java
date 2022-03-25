import java.util.Scanner;

class The_Rating_Dilemma{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int s = sc.nextInt();
            int a = 1, b;
            b = -a-s;
            System.out.println(b);
        }
    }
}