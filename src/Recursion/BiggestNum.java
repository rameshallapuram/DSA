package Recursion;

import com.sun.tools.javac.Main;

import java.util.Locale;

import static java.lang.Math.max;

public class BiggestNum {
    public static void main(String[] args) {
        int [] arr = {2,45,67,89,-12, 94}; //
        var result = LargestInt(arr, arr.length);
        System.out.println("The biggest number in the array is: "+result);
    }

//    public static int LargestInt(int [] arr) {
//        var BigNum = arr[0];
//        for(int i = 1; i<arr.length; i++){
//            if(arr[i] > BigNum){
//                BigNum = arr[i];
//            }
//        }
//        return BigNum;
//    }
    //recursion method
    public static int LargestInt(int [] arr, int n){
        if (n == 1){
            return arr[0];
        }
        return max(arr[n-1], LargestInt(arr,n-1)); //recursive case
    }
}

