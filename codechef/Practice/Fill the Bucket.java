/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();sc.nextLine();
		//List<Integer> lst = new ArrayList<>();
        //List<Integer> lst2 = new ArrayList<>();
		for(int i=0; i<a; i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();sc.nextLine();
		    System.out.println(x-y);
		}
		sc.close();
	}
}
