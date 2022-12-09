package Big_O_Questions;

public class SumProductArray {
    public static void main(String[] args) {
        int [] arr = {1, 23, 12, 4, 34, 55};
        function(arr);
    }

    public static void function(int [] arr){
        int sum = 0, product=1; //O(1)
        for(int i = 0; i<arr.length; i++){ //O(N)
            sum+=arr[i];     //O(1)
            product*=arr[i];    //O(1)
        }
        System.out.println("Sum is: "+sum); //O(1)
        System.out.println("Product is: "+product); //O(1)
    }
}
 // The time complexity  is O(N)