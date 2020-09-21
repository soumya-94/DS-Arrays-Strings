/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.
 */

public class SortingOddEven {

    public static int [] sortArrayByParity(int A[]) {

        int left=0, right=A.length-1, temp=0;

        while(left<right) {

            //odd, even
            if(A[left]%2 > A[right]%2) {
                temp = A[left];
                A[left] = A[right];
                A[right] = temp;
            }

            if(A[left]%2==0) left++;

            if(A[right]%2==1) right--;
        }
        return A;
    }

    public static void main (String ar[]) {

        int nums[] = {0,1,0,3,12};

        sortArrayByParity(nums);

        for (int num : nums) {
            System.out.print(" "+num);
        }
    }
}
