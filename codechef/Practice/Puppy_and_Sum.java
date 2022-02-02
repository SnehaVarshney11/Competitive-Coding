package Practice;
import java.util.Scanner;

class Puppy_and_Sum{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
		sc.close();
		int t = sc.nextInt();
		while(t-->0)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    for(int i = 0; i <a; i++)
		    {
		        int k = b-1;
		        while(k != 0)
		        {
		            b = b + k;
		            k--;
		        }
		    }
		    System.out.println(b);
		}
	}
}