package Recursion;

class Print1toNwithoutUsingloops {
    static void printTillN(int N){
        // code here
        //Base Condition 
        if(N <= 1) {
            System.out.print(N + " ");
            return;
        }
        printTillN(N-1); // Hypothesis
       System.out.print(N + " "); // Induction
    }
}
