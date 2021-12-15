package CodeForces;
import java.util.Scanner;

public class A_Stones_on_the_Table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		sc.close();
		int n = sc.nextInt();
		String s = sc.next();

		// Counters
		int counter = 0;
		char last = s.charAt(0);

		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == last) counter++;
			else last = s.charAt(i);
        }
		System.out.println(counter);
    }
}