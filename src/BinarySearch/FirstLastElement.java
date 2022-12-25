/*
* Question: Find the first and last occurrence of an integer in a sorted array
*
* */

package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastElement {

    public static void main(String[] args){
        int[] arr={1,4,5,21,23,23,23,23,45,67,78,96};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Given the above array pick a target whose first and last occurrence has to be found: ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(SearchRange(arr, target)));

    }
    public static int[] SearchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        //first occurrence case
        ans[0]  =SearchTarget(nums, target, true);
        if(ans[0]!=-1){ //if first occurrence is found we move to next occurrence else return -1
            ans[1] = SearchTarget(nums, target, false);
        }
        return ans;
    }
    //Binary search method
    public static int SearchTarget(int[] nums, int target, boolean findSatrtIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }else if (target>nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(findSatrtIndex){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
        }return ans;
    }

}
