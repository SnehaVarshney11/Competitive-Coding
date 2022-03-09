import java.util.Scanner;

class Fill_the_Bucket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(k-x);
        }
    }
}