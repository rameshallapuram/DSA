package Recursion;

public class DecToBinary {
    public static void main(String[] args) {
        var result = Conversion(45);
        System.out.println(result);
    }

    public static int Conversion(int a){
        if (a == 0 ){ //base case
            return 0;
        }
        return a%2 + 10*Conversion(a/2); //recursive case
    }
}
