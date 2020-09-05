//Given an array nums of integers, return how many of them contain an even number of digits.

public class NumbersWithEvenDigits {

    public static int findNumbers (int [] nums) {

        int result=0;

        for(int num : nums) {
            int count;
            for(count = 0; num>0; num=num/10) {
                count++;
            }
            if (count % 2 == 0)
            {
                result++;
            }
        }

        return result;

        /*
       int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0)
            {
                count++;
            }
        }
        return count;
         */
    }


    public static void main (String ar[]) {

        int[] nums = {555,901,4823,1771};

        System.out.println(findNumbers(nums));

    }

}
