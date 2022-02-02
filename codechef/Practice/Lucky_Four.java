package Practice;
import java.util.Scanner;

class Lucky_Four{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t, n, count;
        t = sc.nextInt();
        for(int i = 0; i < t; i++){
            count = 0;
            n = sc.nextInt();
	        while(n!=0) {
	            if(n%10 == 4)
	                count++;
	            n = (int) (n/10);
	        }
	        System.out.println(count);
        }
    }
}