package Recursion;

import com.sun.tools.javac.Main;

public class Power {

    public static void main(String[] args){
        Power main = new Power();
        var result = main.power_of_number(60,2);
        System.out.println(result);
    }
    public int power_of_number(int base, int expo){
        if(expo < 0){
            return -1;
        }
        if(expo==0){
            return 1;
        }
        return base*power_of_number(base, expo-1);
    }
}
