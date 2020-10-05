/*
Given a non-empty array of integers, return the third maximum number in this array.
If it does not exist, return the maximum number. The time complexity must be in O(n).
 */

public class ThirdMaxNumber {

    public static int thirdLargest(int nums[]) {

        Integer max = null, second_max = null, third_max = null;

        for (Integer num : nums){

            if(num.equals(max) || num.equals(second_max) || num.equals(third_max))
                continue;

            if(max==null || num > max) {
                third_max = second_max;
                second_max = max;
                max = num;
            }
            else if (second_max == null || num > second_max) {
                third_max = second_max;
                second_max = num;
            }
            else if (third_max == null || num > third_max) {
                third_max = num;
            }
        }

        if(third_max == null)
            return max;

        return third_max;

    }

    public static void main(String ar[]) {

        int arr[] = {5, 2, 2};
        System.out.println("answer:"+thirdLargest(arr));

    }

}
