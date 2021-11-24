package StudyPlan.Algorithm;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2) return true;
        
        else if(n==0 || n%2!=0) return false;
        
        else{
            boolean output = isPowerOfTwo(n/2);
            return output;
        }
    }
}
