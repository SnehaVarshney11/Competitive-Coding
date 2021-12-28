package CodeForces.A;
import java.util.Arrays;
import java.util.Scanner;

public class A_Boy_or_Girl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        String str = sc.next();
        int count = 1;
        String res = "";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for(int i = 1; i < ch.length; i++){
            if(ch[i-1] != ch[i]){
                ++count;
            }
        }
        if(count %2 == 0){
            res = "CHAT WITH HER!";
        } else{
            res = "IGNORE HIM!";
        }
        System.out.println(res);
    }
}