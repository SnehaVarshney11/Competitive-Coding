package CodeForces.A;
import java.util.Scanner;

public class A_Doors_and_Keys{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            int r = 0, b = 0, g = 0;
            int max = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'r'){
                    r++;
                }
                if(str.charAt(i) == 'b'){
                    b++;
                }
                if(str.charAt(i) == 'g'){
                    g++;
                }
                if(str.charAt(i) == 'R'){
                    if(r > 0){
                        max++;
                    }else{
                        break;
                    }
                }
                if(str.charAt(i) == 'B'){
                    if(b > 0){
                        max++;
                    }else{
                        break;
                    }
                }
                if(str.charAt(i) == 'G'){
                    if(g > 0){
                        max++;
                    }else{
                        break;
                    }
                }
            }
            if(max == 3){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}