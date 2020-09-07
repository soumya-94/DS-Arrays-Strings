/*
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory
 */

public class SortedDeletion {

    public static int removeDuplicates(int [] nums) {

        //first element will always be counted as the first unique num
        int unique = 1;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[unique] = nums[i+1];
                unique++;
            }
        }
        return unique;
    }

    public static void main (String ar[]) {

        int nums[] = {0,0,1,1,1,2,2,3,3,4};

        int len = removeDuplicates(nums);

        System.out.println(len);

        for (int num : nums) {
            System.out.print(num+", ");
        }

    }

}
