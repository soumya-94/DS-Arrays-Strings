/*
Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]
 */

public class MountainArray {

    public static boolean validMountainArray(int A[]) {

        int i=0;

        if(A.length < 3)
            return false;

        while(i+1 < A.length && A[i] < A[i+1]) {
            i++;
            //System.out.println("exiting first while loop");
        }
        if(i==0 || i+1 >= A.length) {
            return false;
        }
        while(i+1 < A.length) {
            if(A[i] <= A[i+1]) {
                //System.out.println("exiting second while loop if condition");
                return false;
            }
            i++;
            //System.out.println("exiting second while loop");
        }
        //System.out.println("exiting function");
        return true;

    }

    public static void main (String ar[]) {

        int nums[] = {3,5,5};

        System.out.println(validMountainArray(nums));

    }

}
