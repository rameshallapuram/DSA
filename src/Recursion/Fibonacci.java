package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci recursion = new Fibonacci();
        int rec = recursion.fibonacci(7);
        System.out.println(rec);
    }

    public int fibonacci(int n){
        if (n<0){
            return -1;
        }
        if (n==1 || n==0){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}