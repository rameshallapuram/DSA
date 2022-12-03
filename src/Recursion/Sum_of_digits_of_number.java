package Recursion;

public class Sum_of_digits_of_number {
    public static void main(String[] args) {
        var sum = sum_of_digits(4);
        System.out.println(sum);
    }

    public static int sum_of_digits(int n){
        if(n==0 || n<0){
            return 0;
        }
        return n%10 + sum_of_digits(n/10);
    }
}
