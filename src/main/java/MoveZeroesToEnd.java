/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 */

public class MoveZeroesToEnd {

    public static int[] moveZeroes(int[] arr) {

        int nonZero=0, count=0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                nonZero = arr[i];
                arr[i] = arr[count];
                arr[count] = nonZero;
                count++;
            }
        }
        return arr;
    }

    public static void main (String ar[]) {

        int nums[] = {0,1,0,3,12};

        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(" "+num);
        }
    }

}
