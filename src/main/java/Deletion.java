/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */

public class Deletion {

    public static int removeElement(int [] nums, int val) {

        int len = 0;
        for (int num : nums) {
            if(num != val) {
                nums[len] = num;
                len++;
            }
        }
        return len;
    }

    public static void main (String ar[]) {

        int nums[] = {4, 5};

        int len = removeElement(nums, 4);

        System.out.println(len);

        for (int num : nums) {
            System.out.print(num+", ");
        }

    }

}
