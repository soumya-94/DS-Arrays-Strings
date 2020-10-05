/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingNumbers {

    public static List<Integer> findDisappearedNumbers(int nums[]) {

        List<Integer> missingNums = new ArrayList<Integer>();
        HashSet<Integer> numbers = new HashSet<Integer>();

        for(int num : nums) {
            numbers.add(num);
        }

        for (int i=1; i<=nums.length; i++) {
            if(!numbers.contains(i))
                missingNums.add(i);
        }

        return missingNums;
    }

    public static void main(String ar[]) {

        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));

    }
}
