package Practice;
import java.util.Scanner;

class Equinox_Strings{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        try{
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                long anuradha_count = 0;
                long sarthak_count = 0;
                while(n-->0){
                    String str = sc.next();
                    char ch = str.charAt(0);
                    if(ch=='E' || ch=='Q' || ch=='U' || ch=='I' ||ch=='N'|| ch=='O'||ch=='X'){
                        sarthak_count += a;
                     }else{
                         anuradha_count += b;
                     }
                }
                if(sarthak_count > anuradha_count){
                    System.out.println("SARTHAK");
                }
                else if(sarthak_count == anuradha_count){
                    System.out.println("DRAW");
                }
                else{
            	    System.out.println("ANURADHA");
            	}
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}