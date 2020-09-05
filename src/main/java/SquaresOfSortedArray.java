//Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static int [] sortedSquares(int [] A) {

        int answer[] = new int [A.length];

        int left = 0, right = A.length-1;

        //filling the answer array in reverse

        for (int i = A.length-1; i>=0; i--) {
            if (Math.abs(A[left]) > A[right]) {
                    answer[i] = A[left]*A[left];
                    left++;
            }
            else {
                answer[i] = A[right]*A[right];
                right--;
            }
        }

        return answer;

        /*
        for (int i=0; i<A.length; i++) {
            A[i] = A[i]*A[i];
        }

        Arrays.sort(A);

        return A ;

         */
    }

    public static void main (String ar[]) {

        int A [] = {-7,-3,2,3,11};

        int [] result  = sortedSquares(A);

        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + ", ");
        }

    }
}
