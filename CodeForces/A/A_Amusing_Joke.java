package CodeForces.A;
import java.util.Arrays;
import java.util.Scanner;

public class A_Amusing_Joke{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        String input1 = sc.nextLine().toLowerCase();
        String input2 = sc.nextLine().toLowerCase();
        String input3 = sc.nextLine().toLowerCase();
 
        String resultOfOneAndTwo = input1+input2;
        char[] resultArray = resultOfOneAndTwo.toCharArray();
        Arrays.sort(resultArray);
        String sortedResult=String.valueOf(resultArray);
 
        char [] inputChar = input3.toCharArray();
        Arrays.sort(inputChar);
        String input3Sorted= String.valueOf(inputChar);
 
        if(input3Sorted.equals(sortedResult))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}