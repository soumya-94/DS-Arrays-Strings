/*
Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of all the numbers to the left of the index is equal to the sum of all the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 */

public class Pivot {

    public static int pivotIndex(int[] nums) {

        int total_sum=0, left_sum=0;

        for (int num : nums) {
            total_sum += num;
        }

        for(int i=0; i<nums.length; i++) {
            //System.out.println(left_sum);
            if(total_sum - left_sum - nums[i] == left_sum)
                return i;
            left_sum += nums[i];
        }

        return -1;
    }

    public static void main(String ar[]) {

        int arr[] = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));

    }
}
