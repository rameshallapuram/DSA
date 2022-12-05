package Recursion;

import java.util.Scanner;
//recursion to find the greatest common factor;
public class GCD {
    public static void main(String[] args) {
        var result = gcd(48,12);
        System.out.println(result);

    }

    public static int gcd(int a, int b){
        if(a<0 || b<0){
            return -1;
        }
        if(b == 0){
            return a;
        }
        return gcd(b,a%b); //recursive case
    }
}
