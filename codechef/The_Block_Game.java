import java.util.Scanner;

class The_Block_Game{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		sc.close();
		int t = sc.nextInt();
		while(t-->0){
			int r,n,num;
			int rev=0;
			num = sc.nextInt();	
            n = num;
		    while(num>0){
		        r = num % 10;
		        num = num/ 10;
	            rev = rev*10 +r;
		    }
		    if(rev == n){
		        System.out.println("wins");
		    }
		    else{
		        System.out.println("loses");
		    }
	    }
    }
}