import java.util.Arrays;
import java.util.Scanner;

class Missing_Numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            int[] ar = new int[4];
            for(int i = 0; i < 4; i++){
                ar[i] = sc.nextInt();
            }
            Arrays.sort(ar);
            int a1 = (ar[2]+ar[0])/2;
            int b1 = ar[2]-a1;
            int a2 = (ar[2]+ar[1])/2;
            int b2 = ar[2]-a2;
            int a3 = (ar[3]+ar[0])/2;
            int b3 = ar[3]-a3;
            int a4 = (ar[3]+ar[1])/2;
            int b4 = ar[3]-a4;

            if((a1%1 == 0) && (a1!=0) &&(b1%1 == 0) && (b1!=0)){
                if((a1/b1 == ar[1]) && (a1*b1 == ar[3]) && (a1 >= 1) &&(b1>=1) && (a1<=10000) && (b1<= 10000)){
                    System.out.println(a1 + " " + b1);
                    continue;
                }
            }
            if ((a2 % 1 == 0) && (a2 != 0) && (b2 % 1 == 0) && (b2 != 0)) 
                if ((a2 / b2 == ar[0]) && (a2 * b2 == ar[3]) && (a2 >= 1) && (b2 >= 1) && (a2 <= 10000) && (b2 <= 10000)) { 
                    System.out.println(a2 + " " + b2);
                    continue; 
                } 
            if ((a3 % 1 == 0) && (a3 != 0) && (b3 % 1 == 0) && (b3 != 0)) 
                if ((a3 / b3 == ar[1]) && (a3 * b3 == ar[2]) && (a3 >= 1) && (b3 >= 1) && (a3 <= 10000) && (b3 <= 10000)) { 
                    System.out.println(a3 + " " + b3);
                    continue; 
                } 
            if ((a4 % 1 == 0) && (a4 != 0) && (b4 % 1 == 0) && (b4 != 0)) 
                if ((a4 / b4 == ar[0]) && (a4 * b4 == ar[2]) && (a4 >= 1) && (b4 >= 1) && (a4 <= 10000) && (b4 <= 10000)) { 
                    System.out.println(a4 + " " + b4);
                    continue; 
                } 
            
            System.out.println("-1" + " " +"-1");
        }
    }
}