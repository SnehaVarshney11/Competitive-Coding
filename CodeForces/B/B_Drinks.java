package CodeForces.B;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_Drinks{
    public static void main(String[] args) {
        try {	
	    	
	    	BufferedReader read =new BufferedReader( new InputStreamReader( System.in)); // STDIN
	    	
	    	Integer nDrinks=Integer.valueOf(read.readLine().trim());
	    	Integer[] percentages=new Integer[nDrinks];
	    	Integer sum=0;
	    	String[] str=read.readLine().trim().split(" ",nDrinks);
	    	for(int i=0;i!=str.length;i++){
	    		percentages[i]=Integer.valueOf(str[i].trim()); 
	    		sum+=percentages[i]; }
	    	System.out.println((double)sum/percentages.length);
	    	
		    }catch(Exception e){
		    	e.printStackTrace(System.err);
		}
    }
}