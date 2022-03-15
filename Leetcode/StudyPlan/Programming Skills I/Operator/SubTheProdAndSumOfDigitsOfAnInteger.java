class SubTheProdAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int product_of_digits = 1;
        int sum_of_digits = 0;
        while(n != 0){
            int rev = n % 10;
            product_of_digits = product_of_digits * rev;
            sum_of_digits += rev;
            n = n / 10;
        }
        return (product_of_digits - sum_of_digits);
    }    
}
