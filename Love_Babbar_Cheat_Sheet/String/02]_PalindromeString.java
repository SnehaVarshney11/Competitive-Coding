package Love_Babbar_Cheat_Sheet.String;

import java.util.Scanner;

class PalindromeString {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            boolean flag = true;

            for(int i = 0; i < str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-i-1)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("Palindrome");
            } else{
                System.out.println("Not Palindrome");
            }
        }
    }    
}
