package CodeForces.A;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Presents{
    public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String split[] = str.split(" ");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = Integer.parseInt(split[i]);
		calculatePresents(a);
	}
	
	private static void calculatePresents(int a[])
	{
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int no = a[i];
			b[no-1] = i;
		}
		
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+1+" ");
	}
}