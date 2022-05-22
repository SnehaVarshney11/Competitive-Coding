import java.util.Scanner;
public class New_Password{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++){
            int n = sc.nextInt();
            String op = sc.next();
            
            boolean num = false;
            boolean lower = false;
            boolean upper = false;
            boolean sp = false;
            for(int i = 0; i < n; i++){
                char ch = op.charAt(i);
                if(Character.isDigit(ch)){
                    num = true;
                }
                if(Character.isLowerCase(ch)){
                    lower = true;
                }
                if(Character.isUpperCase(ch)){
                    upper = true;
                }
                if(ch == '#' || ch == '@' || ch == '*' || ch == '&'){
                    sp = true;
                }
            }
            if(!num){
                op += '1';
            }
            if(!lower){
                op += 'a';
            }
            if(!upper){
                op += 'A';
            }
            if(!sp){
                op += '&';
            }
            if (op.length() < 7){
              while (op.length() < 7){
                op += '1';
              }
            }
            System.out.println("Case #" + tc + ":" + " " + op);
            sc.close();
        }
    }
}