import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        sc.close();
		int t = sc.nextInt();
		while(t>0) {
			int[] arr = new int[10];
			for(int i=0;i<10;i++) {
				arr[i] = sc.nextInt();
			}
			int j = 9;
			int k = sc.nextInt();
			while(k>=arr[j]) {
				k = k - arr[j];
				j = j-1;
			}
			System.out.println(j+1);
			t = t-1;
		}
	}
}