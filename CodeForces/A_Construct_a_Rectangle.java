package CodeForces;
import java.util.Arrays;
import java.util.Scanner;

public class A_Construct_a_Rectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] ar = new int[3];
        while(t-->0){
            ar[0] = sc.nextInt();
            ar[1] = sc.nextInt();
            ar[2] = sc.nextInt();
            Arrays.sort(ar);

            if(ar[0] + ar[1] == ar[2]){
                sb.append("YES");
            }else if((ar[0] == ar[1] && ar[2] % 2 == 0) || (ar[0] % 2 == 0 && ar[1] == ar[2]) || (ar[1] % 2 == 0 && ar[0] == ar[2])){
                sb.append("YES");
            }else{
                sb.append("NO");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}