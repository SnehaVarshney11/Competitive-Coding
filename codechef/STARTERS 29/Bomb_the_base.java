import java.util.Scanner;

class Bomb_the_base{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] ar = new int[n];
            for(int i = 0; i < n; i++){
                ar[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 0; i < n; i++){
                if(x > ar[i]){
                    count = i+1;
                }
            }
            System.out.println(count);
         }
    }
}