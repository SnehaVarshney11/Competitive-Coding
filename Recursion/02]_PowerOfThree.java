package Recursion;

class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        //Base Condition
        if(n == 1 || n == 3) return true;
        else if(n == 0 || n % 3 != 0) return false;
        else{
            boolean op = isPowerOfThree(n/3);
            return op;
        }
    }
}
