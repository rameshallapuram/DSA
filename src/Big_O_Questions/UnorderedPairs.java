package Big_O_Questions;

public class UnorderedPairs {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        function(arr);
    }

    static void function(int[] arr){
        for(int i= 0; i< arr.length; i++){   //O(N)
            for(int j=i+1; j<arr.length; j++){   //O(N)
                System.out.println(arr[i]+","+arr[j]);  //O(1)
            }
        }
    }
}

//Time complexity is O(N^2)