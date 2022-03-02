package Practice;
import java.util.Scanner;

class Count_the_Holidays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int element;
            int ans = 8;
            for(int i = 0; i < n; i++){
                element = sc.nextInt();
                if(element != 6 && element != 13 && element != 20 && element != 27 && element != 7 
                && element != 14 && element != 21 && element != 28){
                    ans += 1;
                }
            }
            System.out.println(ans);
        }
    }
}