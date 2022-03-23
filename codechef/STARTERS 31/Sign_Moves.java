import java.util.Scanner;

class Sign_Moves{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int move = 0;
            if(n%2 == 0){
                move = n/2;
            }else{
                move = (n+1)/2;
                move = move * -1;
            }
            System.out.println(move);
        }
    }
}