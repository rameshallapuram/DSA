package Big_O_Questions;

public class SumProductArray {
    public static void main(String[] args) {
        int [] arr = {1, 23, 12, 4, 34, 55};
        function(arr);
    }

    public static void function(int [] arr){
        int sum = 0, product=1;
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
            product*=arr[i];
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Product is: "+product);
    }
}
