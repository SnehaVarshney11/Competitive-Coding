package Practice;
import java.util.Scanner;

class Gross_Salary{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
        int t = sc.nextInt();
        while(t-->0){
            double salary = sc.nextDouble();
            double HRA = 0;
            double DA = 0;
            double gross = 0;

            if(salary < 1500){
                HRA = 0.1 * salary;
                DA = 0.9 * salary;
            }
            if(salary >= 1500){
                HRA = 500;
                DA = 0.98 * salary;
            }
            gross = salary + HRA + DA;
            System.out.println(gross);
        }
    }
}