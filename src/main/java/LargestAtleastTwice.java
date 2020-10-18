/*
In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the index of the largest element, otherwise return -1
 */

public class LargestAtleastTwice {

    public static int dominantIndex(int[] nums) {

        int maxIndex = 0;

        for(int i=0; i<nums.length; i++) {
            if (nums[maxIndex] < nums[i])
                maxIndex = i;
        }

        for(int i=0; i<nums.length; i++) {
            if (i != maxIndex && nums[maxIndex] < 2*nums[i])
                return -1;
        }
        return maxIndex;
    }

    public static void main(String ar[]) {

        int arr[] = {1,2,3,7};
        System.out.println(dominantIndex(arr));

    }
}
