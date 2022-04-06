//Code By Sneha Varsheney
import java.util.Scanner;

class Make_Them_Equal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(); //size of array
            int[] ar = new int[n];
            
            int ans = 0;
            for(int i = 0; i < n; i++){
                ar[i] = sc.nextInt();
                if(ar[i] % 2 == 0){
                    ans += 1;
                }
            }
            if((n-ans) % 2 == 0){
                System.out.println(Math.min(ans, (n-ans)/2));
            }else{
                System.out.println(ans);
            }
            sc.close();
        }
    }
}