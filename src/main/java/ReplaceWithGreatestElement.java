/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.
 */

public class ReplaceWithGreatestElement {

    public static void replaceElements(int[] arr) {

        int rightMax = -1, newMax = 0;

        for(int i=arr.length -1; i>=0; i--) {
            if(rightMax > arr[i])
                newMax = rightMax;
            else
                newMax = arr[i];
            arr[i] = rightMax;
            rightMax = newMax;
        }

        //return arr;
    }

    public static void main (String ar[]) {

        int nums[] = {17,18,5,4,6,1};

        replaceElements(nums);

        for (int num : nums) {
            System.out.print(" "+num);
        }
    }
}
