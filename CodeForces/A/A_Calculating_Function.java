package CodeForces.A;
import java.util.Scanner;

public class A_Calculating_Function{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		sc.close();
		long n = sc.nextLong();
		long fn;
		
		// Calculate
		if (n%2 == 0) fn = n/2;
		else fn = (-1)*(n/2 + 1);
		
		// Output
		System.out.println(fn);
    }
}