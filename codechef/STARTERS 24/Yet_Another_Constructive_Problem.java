import java.util.Scanner;

class Yet_Another_Constructive_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            String str = Integer.toBinaryString(x);
            int a = Integer.parseInt("1" + str, 2);
            int b = (x >> 1);
            int c = x + 0;
            System.out.println(b + " " + c + " " + a);
           // System.out.println((a | b) & (b | c) & (c | a));
        }
    }
}