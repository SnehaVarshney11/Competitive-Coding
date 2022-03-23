import java.util.Scanner;

class Group_Assignment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int ans = 2*n-(x-1);
            System.out.println(ans);
        }
    }
}