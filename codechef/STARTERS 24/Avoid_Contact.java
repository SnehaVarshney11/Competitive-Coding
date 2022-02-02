import java.util.Scanner;

class Avoid_Contact{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ans = 0;

            if(y == 0){
                System.out.println(x);
            }
            else if(x == y){
                System.out.println(2 * y - 1);
            }
            else{
                ans = (2 * y) + (x-y);
                System.out.println(ans);
            }
        }
    }
}