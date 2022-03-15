import java.util.Arrays;

class AverageSalaryExcludingTheMinAndMaxSalary {
    public double average(int[] salary) {
        double sum = 0;
        Arrays.sort(salary);
        salary[0] = 0;
        salary[salary.length-1] = 0;
        for(int i = 0; i < salary.length; i++){
            sum += salary[i];
        }
        return (sum/(salary.length-2));
    }    
}
